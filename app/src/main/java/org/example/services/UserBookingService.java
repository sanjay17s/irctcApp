package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;
import org.example.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {

    private User user;
    private List<User> userList ;
    private static final String users_path =  "/Users/sanjays/Desktop/Projects/IRCTC/app/src/main/java/org/example/localDb/users.json";
     private ObjectMapper objectMapper = new ObjectMapper();

    public UserBookingService(User user ) throws IOException {
        this.user = user;
        File users = new File(users_path);
       userList = objectMapper.readValue(users, new TypeReference< List<User>>() {});

    }

    public Boolean loginUser(){
       Optional<User> foundUser = userList.stream().filter(user1 -> {
           return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(),user1.getHashedPassword());
        }).findFirst();
       return  foundUser.isPresent();
    }

    public Boolean signupUser(User user1) {
        try {
            userList.add(user1);
            saveUserToFile();
            return Boolean.TRUE;
        } catch (IOException e) {
            return Boolean.FALSE;
        }
    }

    public void saveUserToFile() throws IOException {
        File userFile = new File(users_path);
        objectMapper.writeValue(userFile,userList);
    }

}
