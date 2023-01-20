package com.shop.ecommerse.domain.request.user;

import lombok.Data;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class UpdateUserRequest {

    @Pattern(regexp = "^[a-zA-Z\\s]+$")
    @Size(min = 3, max = 26)
    private String firstName;

    @Pattern(regexp = "^[a-zA-Z\\s]+$")
    @Size(min = 3, max = 26)
    private String lastName;

    @Pattern(regexp = "\\d+")
    @Size(min = 11, max = 12)
    private String phone;
}