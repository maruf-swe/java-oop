package example2;

public class Circle extends Shape{
    double radius;

    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString(){
        return "Circle color is "+super.getColor() + " and area is " + area();
    }
}
