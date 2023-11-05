package az.lesson.spring.userservice.service;

import az.lesson.spring.userservice.dto.request.SignUpRequest;
import az.lesson.spring.userservice.dto.request.SigninRequest;
import az.lesson.spring.userservice.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}