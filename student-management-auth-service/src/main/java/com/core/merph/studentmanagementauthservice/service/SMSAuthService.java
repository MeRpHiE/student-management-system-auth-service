package com.core.merph.studentmanagementauthservice.service;

import com.core.merph.studentmanagementauthservice.dto.auth.AuthRequestDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.AuthResponseDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.KeycloakAuthRequestDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.KeycloakAuthResponseDTO;
import com.core.merph.studentmanagementauthservice.exception.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */

@Service
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

                //TODO : Add log message
                authResponseDTO.setAuthToken(keycloakAuthResponseDTO.getToken());

        }catch (Exception ex){
            //TODO : Add log message
            throw new AuthenticationException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }

        return authResponseDTO;
    }

    @Override
    public void logoutUser(String username) {

    }
}
