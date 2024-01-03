package com.milewskiarkadiuszmodul8.asmilewskiModul8;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distance() {
        Point p1 = new Point(3, 4);
        return Math.sqrt(x * x + y * y);

    } // taki wzor ponieważ zawsze

    // Metoda zwracająca odległość między tym punktem a podanym punktem
    public double distance(Point point) {
        int dx = this.x - point.x;                              // Najpierw obliczamy delte z x
        int dy = this.y - point.y;                              // obliczamy delte y
        return Math.sqrt(Math.pow(dx, dx) + Math.pow(dy, dy));

    }

    // Metoda zwracająca odległość między tym punktem a punktem o współrzędnych (x, y)
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);

    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX(){ return x;}

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return x == point.x && y == point.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
