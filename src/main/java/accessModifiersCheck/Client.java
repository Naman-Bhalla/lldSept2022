package accessModifiersCheck;

import accessmodifiers.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Naman";
//        student.batchId = 123;
//        student.psp = 91.0;
        student.universityName = "FGH";
    }
}
