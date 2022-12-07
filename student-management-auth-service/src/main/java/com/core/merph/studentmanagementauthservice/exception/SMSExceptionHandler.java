package com.core.merph.studentmanagementauthservice.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */
@ControllerAdvice
public class SMSExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<Object> handleAuthenticationException(AuthenticationException authenticationException){

        ResponseEntity<Object> exceptionResponseResponseEntity = new ResponseEntity<>(authenticationException.getMessage(), authenticationException.getHttpStatus());
        return  exceptionResponseResponseEntity;
    }
}
