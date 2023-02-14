package com.demo.domain.validator;

import javax.inject.Named;

import lombok.AllArgsConstructor;

@Named
@AllArgsConstructor
public class UserModelValidator {
    private final ModelValidator modelValidator;
}
