package com.core.merph.studentmanagementauthservice.dto.auth;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */
public class KeycloakAuthResponseDTO {

    private String token;

    public KeycloakAuthResponseDTO() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
