package com.core.merph.studentmanagementauthservice.service;

import com.core.merph.studentmanagementauthservice.dto.auth.AuthRequestDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.AuthResponseDTO;
import com.core.merph.studentmanagementauthservice.exception.AuthenticationException;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */
public interface AuthService {

    AuthResponseDTO authenticateUser(AuthRequestDTO authRequestDTO) throws AuthenticationException;

    void logoutUser(String username);
}
