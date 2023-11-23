package example1;

public class Person {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Maruf");
        h1.setAge(25);

        System.out.println(h1.getName());
        System.out.println(h1.getAge());
    }
}
