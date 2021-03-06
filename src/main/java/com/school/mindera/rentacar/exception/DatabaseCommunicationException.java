package com.school.mindera.rentacar.exception;

/**
 * Database communication Exception trowed when communication with database isn't successfully established
 */
public class DatabaseCommunicationException extends RuntimeException {
    public DatabaseCommunicationException(String message){
        super(message);
    }
    public DatabaseCommunicationException(String message, Throwable e){
        super(message, e);
    }
}
