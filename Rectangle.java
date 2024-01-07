package com.milewskiarkadiuszmodul8.asmilewskiModul8;

public class Rectangle {
    private double height;
    private double width;

    private int positionX;
    private int positionY;


    //Konstruktor z podanymi współrzednymi
    public Rectangle(double height, double width, int positionX, int positionY) {
        this.height = height;
        this.width = width;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double getHeight() {
        return height;
    }
    public void Area(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double calculateArea() { return height * width; };
    public void move(int x, int y) {};
    public void containsPoint(Point p) {

    }



}

