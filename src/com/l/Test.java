package com.l;

class Test {

    static void printArea(Shape shape) {
        System.out.println("Shape area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Shape rect = new Rectangle(2, 3);
        printArea(rect);

        Shape square = new Square(5);
        printArea(square);
    }
}
