package com.milewskiarkadiuszmodul8.asmilewskiModul8;

public class Main {

    public static void main (String[] args) {
        Point p1 = new Point(3, 4);

        System.out.println("Punkt p1: " + p1);
        System.out.println("Odległość od punktu (0, 0): " + p1.distance());
        System.out.println("Odległość od punktu (5, 6): " + p1.distance(5, 6));
    }


}
