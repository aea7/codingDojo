package Task6;

public class ClassA implements Class1{


    private String name;
    private String department;

    ClassA(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void callMe(ClassB classB) {
        System.out.println(name + " Class A");
        classB.callMe();
    }

}
