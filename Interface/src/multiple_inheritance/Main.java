package multiple_inheritance;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();

        Cat c = new Cat();
        c.eat();
        c.sleep();
    }
}
