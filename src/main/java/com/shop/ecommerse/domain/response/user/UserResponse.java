package com.shop.ecommerse.domain.response.user;

import lombok.Data;

@Data
public class UserResponse {

    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String phone;
    private String country;
    private Integer emailVerified;
}