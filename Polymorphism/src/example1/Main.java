package example1;
// Polymorphism in Java is the task that performs a single action in different ways.
/*
An individual can have different relationships with different people. A woman can be a mother, a daughter, a sister,
 and a friend, all at the same time, i.e. she performs other behaviors in different situations.
 */
class Main {
    public static void main(String[] args) {
        Shapes myShape = new Shapes();  // Create a Shapes object
        Shapes myTriangle = new Triangle();  // Create a Triangle object
        Shapes myCircle = new Circle();  // Create a Circle object
        myShape.area();
        myTriangle.area();
        myShape.area();
        myCircle.area();
    }
}