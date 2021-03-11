package com.school.mindera.rentacar.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RentNotFoundException extends RuntimeException {
    public RentNotFoundException(String message) { super(message); }
}
