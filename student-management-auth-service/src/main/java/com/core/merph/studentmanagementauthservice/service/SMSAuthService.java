package com.core.merph.studentmanagementauthservice.service;

import com.core.merph.studentmanagementauthservice.dto.auth.AuthRequestDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.AuthResponseDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.KeycloakAuthRequestDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.KeycloakAuthResponseDTO;
import com.core.merph.studentmanagementauthservice.exception.AuthenticationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */

@Service
@Slf4j
public class SMSAuthService implements AuthService{

    //TODO : Add logger
    private KeycloakService keycloakService;

    @Autowired
    public SMSAuthService(KeycloakService keycloakService){
      this.keycloakService = keycloakService;
    }

    @Override
    public AuthResponseDTO authenticateUser(AuthRequestDTO authRequestDTO) throws AuthenticationException {

        AuthResponseDTO authResponseDTO = null;

        try {
                authResponseDTO = new AuthResponseDTO(new Date());

                KeycloakAuthRequestDTO keycloakAuthRequestDTO = new KeycloakAuthRequestDTO();
                keycloakAuthRequestDTO.setUsername(authRequestDTO.getUsername());
                keycloakAuthRequestDTO.setPassword(authRequestDTO.getPassword());

                KeycloakAuthResponseDTO keycloakAuthResponseDTO = keycloakService.authenticateKeycloakUser(keycloakAuthRequestDTO);

                authResponseDTO.setAuthToken(keycloakAuthResponseDTO.getToken());

        }catch (Exception ex){
            log.error("Error occurred while authenticating user with error : {}", ex.getMessage());
            throw new AuthenticationException(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return authResponseDTO;
    }

    @Override
    public void logoutUser(String username) {

    }
}
