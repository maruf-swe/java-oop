package example2_method_overriding;

// same method in 3 class
public class Main {
    public static void main(String[] args) {
        SubClass s1 = new SubClass();
        SubClass2 s2 = new SubClass2();
        Parent p1 = new Parent();
        
        s1.Print();
        s2.Print();
        p1.Print();



    }
}
