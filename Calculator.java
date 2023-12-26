package com.milewskiarkadiuszmodul8.asmilewskiModul8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz działanie jakie chcesz wykonac (Dodawanie, odejmowanie, mnożenie, dzielenie");
        String dzialanie = scanner.nextLine();


        if (dzialanie == null || dzialanie.isEmpty()) {
            System.out.println("Nie wybrałeś poprawnego dzialania");
        }


        System.out.println("Podaj pierwszą liczbę");
        double x = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę");
        double y = scanner.nextDouble();

        assert dzialanie != null;
        switch (dzialanie) {
            case "dodawanie" -> dodawanie(x, y);
            case "odejmowanie" -> odejmowanie(x, y);
            case "mnożenie" -> mnożenie(x, y);
            case "dzielenie" -> dzielenie(x, y);
        }

    }

    public static double dodawanie(double x, double y) {
        double result = x + y;
        System.out.println(result);
        return result;
    }

    public static double odejmowanie(double x, double y) {
        double result = x - y;
        System.out.println(result);
        return result;
    }

    public static double mnożenie(double x, double y) {
        double result = x * y;
        System.out.println(result);
        return result;
    }

    public static double dzielenie (double x, double y) {
        double result = x / y;
        System.out.println(result);
        return result;
    }
}

