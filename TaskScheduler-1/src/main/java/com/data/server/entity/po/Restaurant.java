package com.data.server.entity.po;

import lombok.Data;

@Data
public class Restaurant {
    private int restId;
    private String restName;
    private String restPosition;
    private int meanPrice;
    private String type;
}
