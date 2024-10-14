package com.koitourdemo.demo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class KoiRequest {
    String name;
    String color;
    String weight;
    String size;
    String origin;
    float price;
    String description;
    String image;
    Date createAt;

}
