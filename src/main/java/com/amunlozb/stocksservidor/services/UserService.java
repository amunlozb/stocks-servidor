package com.amunlozb.stocksservidor.services;

import com.amunlozb.stocksservidor.entities.DTO.UsuarioResponse;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    UserDetailsService userDetailsService();
    List<UsuarioResponse> getAllUsers();
}
