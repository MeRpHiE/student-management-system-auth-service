package com.core.merph.studentmanagementauthservice.controller;

import com.core.merph.studentmanagementauthservice.dto.auth.AuthRequestDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.AuthResponseDTO;
import com.core.merph.studentmanagementauthservice.exception.AuthenticationException;
import com.core.merph.studentmanagementauthservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */

@RestController
@RequestMapping("/login")
public class AuthController {

    AuthService authService;

    @Autowired
    public AuthController( AuthService authService){
        this.authService = authService;
    }

    @PostMapping
    public ResponseEntity<AuthResponseDTO>authenticateUser(@Validated @RequestBody AuthRequestDTO authRequestDTO) throws AuthenticationException {
        AuthResponseDTO authResponseDTO = authService.authenticateUser(authRequestDTO);
        return new ResponseEntity<>(authResponseDTO, HttpStatus.OK);
    }

    @GetMapping("/session/logout")
    public void logoutUser(){

    }
}
