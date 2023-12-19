package com.example.Homework10.exception;

import com.example.Homework10.controller.CalculatorController;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CalculatorRuntimeException extends RuntimeException{
    public CalculatorRuntimeException(String message) {
        super(message);
    }
}
