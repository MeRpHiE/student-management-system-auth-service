package com.core.merph.studentmanagementauthservice.exception;

import org.springframework.http.HttpStatus;

/**
 * @author MeRpHiE
 *
 * e-mail : asiri.abayakoon@gmail.com
 */
public class AuthenticationException extends RuntimeException{

    private HttpStatus httpStatus;

    public AuthenticationException(HttpStatus httpStatus){
        this.httpStatus = httpStatus;
    }

    public AuthenticationException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public AuthenticationException(String message, Throwable cause, HttpStatus httpStatus) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }

    public AuthenticationException(Throwable cause, HttpStatus httpStatus) {
        super(cause);
        this.httpStatus = httpStatus;
    }

    public AuthenticationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, HttpStatus httpStatus) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
