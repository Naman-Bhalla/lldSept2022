package introtooop;

public class Main {

    public static void main(String[] args) {
        // int a = 2;
        // [DataType] [nameOfVariable] = [valueOfVariable]

        Student naman = new Student();
        naman.name = "Naman";
        naman.age = 24;

        Student dinesh = new Student();
        dinesh.name = "Dinesh";
        dinesh.age = 19;

        System.out.println(dinesh.name);
        System.out.println(dinesh.age);
    }
}
