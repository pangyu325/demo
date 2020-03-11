package com.data.server.entity.po;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Hotel {
    private int hotelId;
    private String hotelName;
    private String grade;
    private String position;
    private String address;
    private String romeType;
    private BigDecimal price;
    private int romeNum;
    private String minPrice;
    private String hotelType;
    private int scenicId;

}
