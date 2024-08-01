package com.EaseBus.exceptions;

public class BusNotFoundException extends RuntimeException{
    public BusNotFoundException(String message) {
        super(message);
    }
}
