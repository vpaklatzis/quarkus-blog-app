package com.demo.domain.feature;

import com.demo.domain.model.user.CreateUserInput;
import com.demo.domain.model.user.User;

public interface CreateUser {
    User handle(CreateUserInput createUserInput);
}
