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

    public void Area(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double calculateArea() { return height * width; };
    public void move(int x, int y) {
        setPositionX(positionX + x);
        setPositionY(positionY + y);
    };
    public boolean containsPoint(Point p) {
        return p.getX() >= positionX && p.getX() <= positionX + width &&
                p.getY() >= positionY && p.getY() <= positionY + height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if(height > 0 ) {    //Zakladamy ze height musi być wieksze niż zero zeby utworzyć plansze
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }
    public int getPositionX() {
        return positionX;
    }
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }






}

