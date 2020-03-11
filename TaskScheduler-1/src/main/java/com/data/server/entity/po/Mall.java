package com.data.server.entity.po;

import lombok.Data;

@Data
public class Mall {
    private int mallId;
    private String mallName;
    private String type;
    private String position;
    private float price;
    private int scenicId;
}
