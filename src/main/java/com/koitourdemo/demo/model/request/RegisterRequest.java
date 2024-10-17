package com.koitourdemo.demo.model.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegisterRequest {

    @NotBlank(message = "Firstname cannot blank!")
    String firstName;

    @NotBlank(message = "Lastname cannot blank!")
    String lastName;

    @NotBlank(message = "Email cannot blank!")
    @Email(message = "Email not valid!")
    @Column(unique = true)
    String email;

    @NotBlank(message = "Phone cannot blank!")
    @Pattern(regexp = "(84|0[3|5|7|8|9])+(\\d{8})", message = "Phone invalid!")
    @Column(unique = true)
    String phone;

    @NotBlank(message = "Password cannot blank!")
    @Size(min = 6, message = "Password must be at least 6 digits!")
    String password;

    @NotBlank(message = "Address cannot blank!")
    String address;

    Date createAt;
}