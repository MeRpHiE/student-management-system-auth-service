package com.core.merph.studentmanagementauthservice.service;

import com.core.merph.studentmanagementauthservice.dto.auth.KeycloakAuthRequestDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.KeycloakAuthResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */

@Service
public class SMSKeycloakService implements KeycloakService{

    private RestTemplate restTemplate;

    public SMSKeycloakService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public KeycloakAuthResponseDTO authenticateKeycloakUser(KeycloakAuthRequestDTO keycloakAuthRequestDTO) {
        KeycloakAuthResponseDTO keycloakAuthResponseDTO = new KeycloakAuthResponseDTO();

        return keycloakAuthResponseDTO;
    }
}
