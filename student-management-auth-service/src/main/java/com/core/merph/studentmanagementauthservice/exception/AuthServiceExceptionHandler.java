package com.core.merph.studentmanagementauthservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */
@ControllerAdvice
public class AuthServiceExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<Object> handleAuthenticationException(AuthenticationException authenticationException){
        ResponseEntity<Object> exceptionResponseResponseEntity = null;
        if( null != authenticationException.getHttpStatus()) {
             exceptionResponseResponseEntity = new ResponseEntity<>(authenticationException.getHttpStatus());
        }else{
            exceptionResponseResponseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return  exceptionResponseResponseEntity;
    }
}
