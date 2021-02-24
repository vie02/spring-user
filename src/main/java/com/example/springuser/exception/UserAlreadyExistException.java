package com.example.springuser.exception;

public class UserAlreadyExistException extends RuntimeException {

    public static final long serialVersionUID = -8400634298679138149L;

    public UserAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAlreadyExistException(String message) {
        super(message);
    }

    public UserAlreadyExistException(Throwable cause) {
        super(cause);
    }
}
