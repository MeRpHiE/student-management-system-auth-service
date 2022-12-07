package com.core.merph.studentmanagementauthservice.service;

import com.core.merph.studentmanagementauthservice.dto.auth.KeycloakAuthRequestDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.KeycloakAuthResponseDTO;
import org.springframework.stereotype.Service;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */

@Service
public class SMSKeycloakService implements KeycloakService{

    @Override
    public KeycloakAuthResponseDTO authenticateKeycloakUser(KeycloakAuthRequestDTO keycloakAuthRequestDTO) {
        KeycloakAuthResponseDTO keycloakAuthResponseDTO = new KeycloakAuthResponseDTO();

        return keycloakAuthResponseDTO;
    }
}
