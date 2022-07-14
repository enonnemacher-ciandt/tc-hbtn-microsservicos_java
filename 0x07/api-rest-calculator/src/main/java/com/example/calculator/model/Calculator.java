package com.example.calculator.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculator {

    public Double sum(Double number1, Double number2) {
        if (number1 == null || number2 == null)
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");

        return number1 + number2;
    }

    public Double sub(Double number1, Double number2) {
        if (number1 == null || number2 == null)
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");

        return number1 - number2;
    }

    public Double divide(Double number1, Double number2) {
        if (number1 == null || number2 == null)
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");

        if (number2 == 0)
            throw new ArithmeticException("Divisão por zero não é permitido.");

        return number1 / number2;
    }

    public Integer factorial(Integer factorial) {
        if (factorial == null)
            throw new NullPointerException("Número é obrigatório.");

        int resultado = 1;
        while (factorial > 1) {
            resultado *= factorial;
            factorial--;
        }

        return resultado;
    }

    public Integer integerToBinary(Integer integer) {
        return Integer.valueOf(Integer.toBinaryString(integer));
    }

    public String integerToHexadecimal(Integer integer) {
        return Integer.toHexString(integer).toUpperCase();
    }

    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
        return (int) ChronoUnit.DAYS.between(date1, date2);
    }
}
