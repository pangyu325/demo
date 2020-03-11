package com.data.server.entity.po;


import lombok.Data;

import java.util.Date;
@Data
public class Coach {
    private int trainNumber;
    private String placeOfDeparture;
    private Date timeOfDeparture ;
    private String destination ;
    private Date timeOfArrival;
    private String stopoverPlace;
    private Date stopoverTime;
    private Date ticketTime;
    private int numberOfSeats;
    private int busId;
}
