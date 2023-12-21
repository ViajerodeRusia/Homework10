package com.example.Homework10.service;
import com.example.Homework10.exception.CalculatorRuntimeException;

public interface CalculatorService {
    Double plus(Double num1, Double num2);
    Double minus(Double num1, Double num2);
    Double multiply(Double num1, Double num2);
    Double divide(Double num1, Double num2);
}
