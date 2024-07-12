package org.example.entities;

import org.example.services.UserBookingService;

import java.util.Date;

public class Ticket {

    private String ticketId;
    private String userId;
    private String source;
    private String destination;
    private Train train;
    private Date dateOfTravel;

    public Ticket(String source, String userId, String destination, Train train, Date dateOfTravel, String ticketId) {
        this.source = source;
        this.userId = userId;
        this.destination = destination;
        this.train = train;
        this.dateOfTravel = dateOfTravel;
        this.ticketId = ticketId;
    }

    public Ticket() {
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getUserId() {
        return userId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Train getTrain() {
        return train;
    }

    public Date getDateOfTravel() {
        return dateOfTravel;
    }

    public String getTicketInfo() {
        return String.format("Ticket Id:%s belongs to User %s from %s to %s on %s",
                ticketId,userId,source,destination,dateOfTravel);
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public void setDateOfTravel(Date dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }
}
