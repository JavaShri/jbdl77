package com.example.hibernateJpa.exceptions;

public class BadPersonRequestException extends RuntimeException{
    public BadPersonRequestException(String message) {
        super(message);
    }
}
