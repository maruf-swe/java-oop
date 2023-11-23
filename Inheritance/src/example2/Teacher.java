package example2;

public class Teacher extends Person {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String q) {
        this.qualification = q;
    }

    public void displayAll() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
    }
}
