package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Albert Einstein", 54);
        Student s2 = new Student("Gottfried Wilhelm Leibniz", 1234);
        Student s3 = new Student("Carl Friedrich Gauss", 5431);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList);

        studentList.forEach(student -> {
            System.out.println(student.getName() + " " + student.getId());
        });

    }

}
