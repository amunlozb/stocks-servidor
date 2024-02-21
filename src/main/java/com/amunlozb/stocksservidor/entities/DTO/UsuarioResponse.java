package com.amunlozb.stocksservidor.entities.DTO;

import lombok.Getter;

@Getter
public class UsuarioResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String rol;

    public UsuarioResponse(String firstName, String lastName, String email, String rol) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.rol = rol;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }



}
