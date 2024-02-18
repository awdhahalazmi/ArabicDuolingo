package com.ArabicDuolingo.Arabic.duolingo.service.auth;

import com.ArabicDuolingo.Arabic.duolingo.bo.auth.AuthenticationResponse;
import com.ArabicDuolingo.Arabic.duolingo.bo.auth.CreateLoginRequest;
import com.ArabicDuolingo.Arabic.duolingo.bo.auth.CreateSignupRequest;
import com.ArabicDuolingo.Arabic.duolingo.bo.auth.LogoutResponse;

public interface AuthService {
    void signup(CreateSignupRequest createSignupRequest);


    AuthenticationResponse login(CreateLoginRequest createLoginRequest);
    void logout(LogoutResponse logoutResponse);
}
