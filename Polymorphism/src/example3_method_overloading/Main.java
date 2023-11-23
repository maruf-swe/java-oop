package example3_method_overloading;

//method overloading happens in the same class
// same method name with different variable
public class Main {
    public static void main(String[] args) {
        Shapes myShape = new Shapes();  // Create a Shapes object

        myShape.area();
        myShape.area(5);
        myShape.area(6.0, 1.2);
        myShape.area(6, 2);

    }
}
