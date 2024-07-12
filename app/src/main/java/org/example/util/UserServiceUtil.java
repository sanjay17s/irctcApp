package org.example.util;

import org.mindrot.jbcrypt.BCrypt;

public class UserServiceUtil {

        // Function to hash a password
        public static String hashPassword(String plainPassword) {
            return   BCrypt.hashpw(plainPassword, BCrypt.gensalt());

        }

        // Function to check if a plain password matches a hashed password
        public static boolean checkPassword(String candidatePassword, String hashedPassword) {
            return BCrypt.checkpw(candidatePassword, hashedPassword);
        }
}
