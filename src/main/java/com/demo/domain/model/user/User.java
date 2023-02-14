package com.demo.domain.model.user;

import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.demo.domain.model.constants.ValidationMessages;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @NotNull
    private UUID id;

    @NotBlank(message = ValidationMessages.USERNAME_MUST_BE_NOT_BLANK)
    private String username;

    @Email
    @NotBlank(message = ValidationMessages.EMAIL_MUST_BE_NOT_BLANK)
    private String email;

    @NotBlank(message = ValidationMessages.PASSWORD_MUST_BE_NOT_BLANK)
    private String password;

    private String bio;

    private String imageUrl;
}
