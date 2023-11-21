public class CreatingObject {
    int age = 25;
    String name = "Marufur Rahman";

    public static void main(String[] args) {
        CreatingObject cc1 = new CreatingObject(); // cc1 object are created
        System.out.println(cc1.age);
        System.out.println(cc1.name);
        cc1.name = "Rahman";
        System.out.println(cc1.name); // declare variable from main class using object

    }
}
