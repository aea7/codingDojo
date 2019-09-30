package Task1;

public class Student implements Comparable <Student> {
    private String name;
    private int id;

    public Student() {

    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String n) {
        name = n;

    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student s) {
        return this.getName().compareTo(s.getName());
    }

}
