package com.data.server.entity.po;


import lombok.Data;

import java.util.Date;
@Data
public class Ship {
    private int shipId;
    private int trainNumber;
    private String placeOfDeparture;
    private Date timeOfDeparture;
    private String destination;
    private Date timeOfArrive;
    private String stopoverPlace;
    private Date stopOverTime;
    private Date ticketTime;
    private int numberOfSeats;

}
