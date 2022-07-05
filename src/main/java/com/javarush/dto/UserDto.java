package com.javarush.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private final String firstName;
    private final String lastName;
    @Email
    private final String email;
    @NotBlank
    private final String password;
}
