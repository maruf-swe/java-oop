package multiple_inheritance;

public class Dog implements Animal, Beast {
    public void eat() {
        System.out.println("Dog can eat Milk");
    }

    public void sleep(){
        System.out.println("Dog can sleep");
    }
}
