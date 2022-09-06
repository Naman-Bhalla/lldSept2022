package constructors;

import accessmodifiers.StudentChild;

public class Student {
    String name;
    private int age = 21;
    private String univName;
    double psp;
    boolean isPlaced;

    public Student(Student oldStudent) {
        name = oldStudent.name;
        univName = oldStudent.univName;
        psp = oldStudent.psp;
        isPlaced = oldStudent.isPlaced;;
    }

    public Student(String studentName, String universityName) {
        System.out.println(age);
        name = studentName;
        univName = universityName;
        age = 31;
        System.out.println(age);
    }

    public Student(String name) {
        System.out.println("I AM A CONSTRUCTOR");
    }
}
