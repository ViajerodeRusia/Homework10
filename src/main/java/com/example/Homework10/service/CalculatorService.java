package com.example.Homework10.service;
import com.example.Homework10.exception.CalculatorRuntimeException;

public interface CalculatorService {
    String plus(Double num1, Double num2);
    String minus(Double num1, Double num2);
    String multiply(Double num1, Double num2);
    String divide(Double num1, Double num2) throws CalculatorRuntimeException;
    String greeting();
}
