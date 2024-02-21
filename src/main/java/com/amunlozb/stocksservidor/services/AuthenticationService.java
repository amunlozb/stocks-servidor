package com.amunlozb.stocksservidor.services;

import com.amunlozb.stocksservidor.entities.DTO.JwtAuthenticationResponse;
import com.amunlozb.stocksservidor.entities.DTO.request.SignInRequest;
import com.amunlozb.stocksservidor.entities.DTO.request.SignUpRequest;

public interface AuthenticationService {
    /** REGISTRO */
    JwtAuthenticationResponse signup(SignUpRequest request);
    /** ACCESO a Token JWT */
    JwtAuthenticationResponse signin(SignInRequest request);
}
