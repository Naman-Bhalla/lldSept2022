package polymorphism;

import java.util.Random;

public class Client {

    public static A getSomething() {
        Random random = new Random();
        int a = random.nextInt();

        if (a % 2 == 0) {
            return new B();
        } else {
            return new C();
        }
    }
    public static void main(String[] args) {
        A a = getSomething();
        a.age = 21;
        a.name = "Naman";

        ((C)a).companyName = "Google"; // ERROR

    }
}
