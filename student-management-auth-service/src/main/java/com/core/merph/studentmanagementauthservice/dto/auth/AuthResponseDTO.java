package com.core.merph.studentmanagementauthservice.dto.auth;

import com.core.merph.studentmanagementauthservice.dto.BaseDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */
public class AuthResponseDTO extends BaseDTO {

    @JsonProperty("auth_token")
    private String authToken;

    private String message;

    @JsonProperty("is_success")
    private boolean isSuccess;

    @JsonProperty("created_at")
    private Date createdAt;

    public AuthResponseDTO(Date createdAt) {
        super(createdAt);
    }

    public AuthResponseDTO(Date createdAt, String authToken) {
        super(createdAt);
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
