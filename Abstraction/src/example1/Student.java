package example1;

public class Student extends Teacher {
// child class must implement parent class method
    public void doAssignment() {
        System.out.println("I do the assignment");
    }

    public void doMath() {
        int a = 5;
        int b = 10;
        System.out.println(a + b);
    }
}
