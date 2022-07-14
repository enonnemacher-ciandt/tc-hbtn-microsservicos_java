package com.example.calculator.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void sumTest() {
        assertEquals(6.0, calculator.sum(2.0, 4.0));
    }

    @Test
    public void numbersNullSumTest() {
        Assertions.assertThrows(NullPointerException.class, () ->
                        calculator.sum(null, 2.0)
                , "Número 1 e número 2 são obrigatórios.");
    }

    @Test
    void subTest() {
        assertEquals(-2.0, calculator.sub(2.0, 4.0));
    }

    @Test
    void divideTest() {
        assertEquals(0.5, calculator.divide(2.0, 4.0));
    }

    @Test
    public void divisionByZeroTest() {
        Assertions.assertThrows(ArithmeticException.class, () ->
                        calculator.divide(2.0, 0.0)
                , "Divisão por zero não é permitido.");
    }

    @Test
    void factorialTest() {
        assertEquals(720, calculator.factorial(6));
    }

    @Test
    void integerToBinaryTest() {
        assertEquals(101, calculator.integerToBinary(5));
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("21", calculator.integerToHexadecimal(33));
    }

    @Test
    void calculeDayBetweenDateTest() {
        assertEquals(14, calculator.calculeDayBetweenDate(LocalDate.of(2020, 3, 15), LocalDate.of(2020, 3, 29)));
    }
}
