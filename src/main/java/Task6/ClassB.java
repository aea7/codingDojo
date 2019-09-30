package Task6;

public class ClassB implements Class{

    private String name;
    private String department;

    ClassB(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void callMe() {
        System.out.println(name + " ClassB");
    }
}
