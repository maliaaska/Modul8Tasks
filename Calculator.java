package com.milewskiarkadiuszmodul8.asmilewskiModul8;

import java.util.Scanner;

public class Calculator {
    public double x;
    public double y;
    public double result;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void dodawanie(double x, double y) {
        this.result = x + y;
        System.out.println("Wynik dodawania to " + result);
    }

    public double odejmowanie(double x, double y) {
        this.result = x - y;
        System.out.println("Wynik odejmowania to " + result);
        return result;
    }

    public double mnożenie(double x, double y) {
        this.result = x * y;
        System.out.println("Wynik Mnożenia to " + result);
        return result;
    }

    public double dzielenie (double x, double y) {
        this.result = x / y;
        System.out.println("Wynik dzielenia to " + result);
        return result;
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator(5,10);

        calculator.dodawanie(5,7);
        calculator.odejmowanie(20, 5);
        calculator.mnożenie(3,8);
        calculator.dzielenie(24,3);

    }
}

