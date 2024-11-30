package com.spring.validation.dtos;

import java.util.Date;

import com.spring.validation.model.User;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern.Flag;
import lombok.Data;

@Data
public class RegisterUserDto {

    @NotEmpty(message = "The full name is required.")
    @Size(min = 2, max = 100, message = "The length of full name must be between 2 and 100 characters.")
    private String fullName;

    @NotEmpty(message = "The email address is required.")
    @Email(message = "The email address is invalid.", flags = { Flag.CASE_INSENSITIVE })
    private String email;

    @NotNull(message = "The date of birth is required.")
    @Past(message = "The date of birth must be in the past.")
    private Date dateOfBirth;

    @NotEmpty(message = "The gender is required.")
    private String gender;

    @Valid
    @NotNull(message = "The address is required.")
    private AddressDto address;

    public User toUser() {
        return new User()
                .setName(fullName)
                .setEmail(email.toLowerCase())
                .setBirthDate(dateOfBirth)
                .setGender(gender)
                .setAddress(address.toAddress());
    }
}
