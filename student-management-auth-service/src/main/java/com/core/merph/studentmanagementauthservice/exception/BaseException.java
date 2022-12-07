package com.core.merph.studentmanagementauthservice.exception;

import org.springframework.http.HttpStatus;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */
public class BaseException extends Throwable{

    private HttpStatus httpStatus;

    private String message;

    public BaseException(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public BaseException(String message, HttpStatus httpStatus, String message1) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message1;
    }

    public BaseException(String message, Throwable cause, HttpStatus httpStatus, String message1) {
        super(message, cause);
        this.httpStatus = httpStatus;
        this.message = message1;
    }

    public BaseException(Throwable cause, HttpStatus httpStatus, String message) {
        super(cause);
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, HttpStatus httpStatus, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.httpStatus = httpStatus;
        this.message = message1;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
