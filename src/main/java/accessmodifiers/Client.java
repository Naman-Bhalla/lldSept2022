package accessmodifiers;

public class Client {

    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Naman"; ERROR: name is private
        student.batchId = 123;
        student.psp = 91.0;
        student.universityName = "DEF";
    }
}
