package com.data.server.entity.po;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Fright {
    private int frightId;
    private int frightNumber;
    private String placeOfDeparture;
    private Date timeOfDeparture;
    private String destination;
    private Date timeOfArrival;
    private BigDecimal decimal;
    private int theNumberOfSeats;

}
