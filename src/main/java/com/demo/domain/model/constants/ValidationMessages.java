package com.demo.domain.model.constants;

import javax.resource.spi.IllegalStateException;

public class ValidationMessages {
    public static final String REQUEST_BODY_MUST_BE_NOT_NULL = "Request body must be not null";
    public static final String USERNAME_MUST_BE_NOT_BLANK = "Username must be not blank";
    public static final String EMAIL_MUST_BE_NOT_BLANK = "Email must be not blank";
    public static final String PASSWORD_MUST_BE_NOT_BLANK = "Password must be not blank";

    private ValidationMessages() throws IllegalStateException {
        throw new IllegalStateException("Constants class");
    }
}
