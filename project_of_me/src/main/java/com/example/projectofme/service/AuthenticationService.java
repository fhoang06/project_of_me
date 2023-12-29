package com.example.projectofme.service;

import com.example.projectofme.dto.JwtAuthenticationResponse;
import com.example.projectofme.dto.RefreshTokenRequest;
import com.example.projectofme.dto.SignInRequest;
import com.example.projectofme.dto.SignUpRequest;
import com.example.projectofme.entity.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
