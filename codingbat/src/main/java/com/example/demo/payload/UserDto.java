package com.example.demo.payload;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserDto {
    @NotNull(message = "userName Bo'sh bo'lmasligi kerak")
    private String userName;
    @NotNull(message = "firstName Bo'sh bo'lmasligi kerak")
    private String firstName;
    @NotNull(message = "lastName Bo'sh bo'lmasligi kerak")
    private String lastName;
    @NotNull(message = "email Bo'sh bo'lmasligi kerak")
    private String email;
}
