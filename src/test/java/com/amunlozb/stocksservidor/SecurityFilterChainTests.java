package com.amunlozb.stocksservidor;

import com.amunlozb.stocksservidor.config.SecurityConfig;
import com.amunlozb.stocksservidor.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SecurityFilterChainTests {


    @Mock
    private UserService userService;

    @Mock
    private HttpSecurity httpSecurity;

    @InjectMocks
    private SecurityConfig securityConfig;

    @BeforeEach
    public void setUp() throws Exception {
        when(httpSecurity.csrf()).thenReturn(null);
        when(httpSecurity.authorizeRequests()).thenReturn(null);
        when(httpSecurity.sessionManagement()).thenReturn(null);
        when(httpSecurity.authenticationProvider(null)).thenReturn(null);
        when(httpSecurity.addFilterBefore(null, null)).thenReturn(null);
        when(httpSecurity.build()).thenReturn(null);
    }

    @Test
    public void testSecurityFilterChain() throws Exception {
        SecurityFilterChain result = securityConfig.securityFilterChain(httpSecurity);
        assertNotNull(result);
    }
}

