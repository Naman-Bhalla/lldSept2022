package constructorchaining;

public class D extends C {

    D(String hello) {
        System.out.println(hello);
    }

    D() {
        super();
//        this("Naman"); // method call
//        super("Hello"); // This must be the first line in the constructor
//        super("hello"); // new C("hello");
        System.out.println("Constructor of D");
    }
}
