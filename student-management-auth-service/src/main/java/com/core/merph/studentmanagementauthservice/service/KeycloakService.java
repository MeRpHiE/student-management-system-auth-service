package com.core.merph.studentmanagementauthservice.service;

import com.core.merph.studentmanagementauthservice.dto.auth.KeycloakAuthRequestDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.KeycloakAuthResponseDTO;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */
public interface KeycloakService {

    KeycloakAuthResponseDTO authenticateKeycloakUser(KeycloakAuthRequestDTO keycloakAuthRequestDTO);

}
