package com.core.merph.studentmanagementauthservice.dto.auth;

import com.core.merph.studentmanagementauthservice.dto.BaseDTO;

import java.util.Date;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */
public class AuthRequestDTO {

    private String username;

    private String password;

    public AuthRequestDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
