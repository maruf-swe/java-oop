package multiple_inheritance;

public class Cat implements Animal,Beast{
    public void eat(){
        System.out.println("Cat can eat meat");
    }

    public void sleep(){
        System.out.println("Cat can sleeping");
    }
}
