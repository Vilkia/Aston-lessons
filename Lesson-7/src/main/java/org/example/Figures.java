package org.example;

interface Shape {
    double calculatePerimeter();
    double calculateArea();

    default String getFillColor() {
        return "White";
    }

    default String getBorderColor() {
        return "Black";
    }

    void setFillColor(String color);
    void setBorderColor(String color);
}

class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Rectangle implements Shape {
    private double length, width;
    private String fillColor;
    private String borderColor;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Triangle implements Shape {
    private double a, b, c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

public class Figures {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.setFillColor("Red");
        circle.setBorderColor("Blue");
        System.out.println("Circle -> Perimeter: " + circle.calculatePerimeter() +
                ", Area: " + circle.calculateArea() +
                ", Fill Color: " + circle.getFillColor() +
                ", Border Color: " + circle.getBorderColor());

        Shape rectangle = new Rectangle(4, 6);
        rectangle.setFillColor("Yellow");
        rectangle.setBorderColor("Green");
        System.out.println("Rectangle -> Perimeter: " + rectangle.calculatePerimeter() +
                ", Area: " + rectangle.calculateArea() +
                ", Fill Color: " + rectangle.getFillColor() +
                ", Border Color: " + rectangle.getBorderColor());

        Shape triangle = new Triangle(3, 4, 5);
        triangle.setFillColor("Pink");
        triangle.setBorderColor("Purple");
        System.out.println("Triangle -> Perimeter: " + triangle.calculatePerimeter() +
                ", Area: " + triangle.calculateArea() +
                ", Fill Color: " + triangle.getFillColor() +
                ", Border Color: " + triangle.getBorderColor());
    }
}

