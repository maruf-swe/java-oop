public class ClassObjectExample {
    String name;
    String breed;
    int age;
    String color;

    // Constructor Declaration of Class
    public ClassObjectExample(String name, String breed, int age,
               String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    // method 2
    public String getBreed() {
        return breed;
    }

    // method 3
    public int getAge() {
        return age;
    }

    // method 4
    public String getColor() {
        return color;
    }

    public String toString(){
        return ("Hi my name is "+ this.getName() +"\nMy Bread is "+this.getBreed() + " my color is "+this.getColor());
    }

    public static void main(String[] args) {
        ClassObjectExample clob = new ClassObjectExample("Reddy","Germany", 5,"Black");
        System.out.println(clob.age);
        System.out.println(clob.toString());

    }
}
