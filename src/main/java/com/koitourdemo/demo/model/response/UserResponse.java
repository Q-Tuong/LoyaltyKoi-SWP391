package com.koitourdemo.demo.model.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    long id;
    String firstName;
    String lastName;
    String email;
    String phone;
    String address;
    String token;
}
