package com.data.server.entity.po;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Scenic {
    private int scenicId;
    private String scenicName;
    private String grade;
    private String position;
    private String type;
    private Date businessTime;
    private BigDecimal ticketPrice;
    private String address;
    private String transportation;
    private int scenicPointNum;
    private int maxiCap;
    private String desc;
}
