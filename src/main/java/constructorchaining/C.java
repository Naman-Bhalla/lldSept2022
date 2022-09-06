package constructorchaining;

public class C extends B{

    C() {
        System.out.println("Constructor of C");
    }

    private C(String a) {
        System.out.println("Constructor of C with a param");
    }
}
