package example2;

public class Reactangle extends Shape {
    double length;
    double width;

    public Reactangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return "Rectangle color is " + getColor() + " and area is " + area();
    }
}
