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
        return  p.getX() <= (width / 2) &&
                p.getX() >=  (width / 2) - width &&
                p.getY() <= height / 2  &&
                p.getY() >= (height / 2 ) - height;
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

    @Override
    public boolean equals(Object o ) {
        if (this == o) return true;
        if( o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return rectangle.height == height &&
                rectangle.width == width &&
                positionX == rectangle.getPositionX() &&
                positionY == rectangle.getPositionY();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }

    public static class TestRectangle {
        public static void main(String[] args) {
            Rectangle rectangle1 = new Rectangle(10, 10, 4, 5);
            System.out.println(rectangle1);

            Rectangle rectangle2 = new Rectangle(5, 10, 20, 30);
            System.out.println(rectangle2);

            rectangle1.move(5, 5);
            System.out.println(rectangle1.containsPoint(new Point(4, 0)));
        }
    }
}

