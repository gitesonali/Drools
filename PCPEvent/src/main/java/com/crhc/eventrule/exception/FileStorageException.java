package com.crhc.eventrule.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FileStorageException extends RuntimeException {
    public FileStorageException(String message) {
        super(message);
    }
/**
 * If the filestorage status not found then the error message gets print
 * @param message
 * @param cause
 */
    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}

