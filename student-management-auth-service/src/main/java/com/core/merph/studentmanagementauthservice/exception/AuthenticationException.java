package com.core.merph.studentmanagementauthservice.exception;

import org.springframework.http.HttpStatus;

/**
 * @author MeRpHiE
 *
 * e-mail : asiri.abayakoon@gmail.com
 */
public class AuthenticationException extends BaseException{
    public AuthenticationException(HttpStatus httpStatus, String message) {
        super(httpStatus, message);
    }
}
