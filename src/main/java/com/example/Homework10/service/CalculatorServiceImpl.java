package com.example.Homework10.service;

import com.example.Homework10.exception.CalculatorRuntimeException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public String plus(Double num1, Double num2) {
        return String.format("%.0f + %.0f = %.0f", num1, num2, (num1 + num2));
    }

    @Override
    public String minus(Double num1, Double num2) {
        return String.format("%.0f - %.0f = %.0f", num1, num2, (num1 - num2));
    }

    @Override
    public String multiply(Double num1, Double num2) {
        return String.format("%.0f * %.0f = %.0f", num1, num2, (num1 * num2));
    }

    @Override
    public String divide(Double num1, Double num2) {
        return String.format("%.0f / %.0f = %.2f", num1, num2, (num1 / num2));
    }
}
