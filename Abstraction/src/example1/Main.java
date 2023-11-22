package example1;
// If you need to provide a base for a hierarchy of classes or
// provide a common implementation, you should use abstract classes.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.doAssignment();
        s1.doMath();
    }
}
