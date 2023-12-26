package com.milewskiarkadiuszmodul8.asmilewskiModul8;

public class Point {
    private int x;
    private int y;

    public Point( int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Metoda zwracająca odległość między tym punktem a podanym punktem
    public double distance(Point point) {
        int dx = this.x - point.x;
        int dy = this.y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    // Metoda zwracająca odległość między tym punktem a punktem o współrzędnych (x, y)
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main (String[] args) {
        Point p1 = new Point(3, 4);
        System.out.println("Punkt p1: " + p1);
        System.out.println("Odległość od punktu (0, 0): " + p1.distance());
        System.out.println("Odległość od punktu (5, 6): " + p1.distance(5, 6));
    }
}
