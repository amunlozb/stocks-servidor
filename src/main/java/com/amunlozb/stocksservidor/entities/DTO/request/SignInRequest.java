package com.amunlozb.stocksservidor.entities.DTO.request;

import lombok.Getter;

@Getter
public class SignInRequest {
    private String email;
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}