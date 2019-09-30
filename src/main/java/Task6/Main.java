package Task6;

public class Main {

    public static void main(String[] args) {
        ClassA classA = new ClassA("Abdullah", "IT");
        ClassB classB = new ClassB("Marcel", "HR");
        classA.callMe(classB);
        classB.callMe();
    }

}
