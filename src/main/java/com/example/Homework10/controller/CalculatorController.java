package com.example.Homework10.controller;

import com.example.Homework10.exception.CalculatorRuntimeException;
import com.example.Homework10.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {
    private  final CalculatorService calculatorService;

    public CalculatorController(@Autowired CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping(path = "/plus")
    public String plusOperation(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        if(num1 == null || num2 == null) throw new CalculatorRuntimeException("Параметры не поданы");
        return calculatorService.plus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String minusOperation(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        if(num1 == null || num2 == null) throw new CalculatorRuntimeException("Параметры не поданы");
        return calculatorService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiplyOperation(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        if(num1 == null || num2 == null) throw new CalculatorRuntimeException("Параметры не поданы");
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divideOperation(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        if(num1 == null || num2 == null) throw new CalculatorRuntimeException("Параметры не поданы");
        if(num2 == 0) throw new CalculatorRuntimeException("На ноль делить нельзя");
        return calculatorService.divide(num1, num2);
    }
    @GetMapping
    public String greetingOperation(){
        return "Добро пожаловать в калькулятор";
    }
}
