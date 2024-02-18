package com.ArabicDuolingo.Arabic.duolingo.service.user;

import com.ArabicDuolingo.Arabic.duolingo.bo.user.CreateUserRequest;
import com.ArabicDuolingo.Arabic.duolingo.bo.user.UpdateUserStatusRequest;

import java.util.List;

public interface UserService {
    void saveUser(CreateUserRequest createUserRequest);

    void updateUserStatus(Long userId, UpdateUserStatusRequest updateUserStatusRequest);
    List<String> getAllUsers();
}
