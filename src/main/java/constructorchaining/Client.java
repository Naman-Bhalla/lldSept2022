package constructorchaining;

public class Client {

    public static void main(String[] args) {
        D d = new D();

        A a = new D();

        D d1 = (D) new A();
    }
}
