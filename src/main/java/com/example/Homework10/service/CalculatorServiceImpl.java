package com.example.Homework10.service;

import com.example.Homework10.exception.CalculatorRuntimeException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public Double plus(Double num1, Double num2) {
        return (num1 + num2);
    }

    @Override
    public Double minus(Double num1, Double num2) {
        return (num1 - num2);
    }

    @Override
    public Double multiply(Double num1, Double num2) {
        return (num1 * num2);
    }

    @Override
    public Double divide(Double num1, Double num2) {
        return (num1 / num2);
    }
}
