package example2;

import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        Circle c1 = new Circle("red", 2.2);
        Reactangle r1 = new Reactangle("Green", 2.2, 3.3);

        System.out.println(c1.toString());
        System.out.println(c1.getColor());

        System.out.println(r1.toString());
        System.out.println(r1.getColor());
    }
}
