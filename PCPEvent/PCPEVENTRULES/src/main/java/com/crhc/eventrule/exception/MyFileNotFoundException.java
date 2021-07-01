package com.crhc.eventrule.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyFileNotFoundException extends RuntimeException {
    public MyFileNotFoundException(String message) {
        super(message);
    }
/**
 * if the file is not found then the error message gets print 
 * @param message
 * @param cause
 */
    public MyFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
