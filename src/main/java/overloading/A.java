package overloading;

public class A {

    // name: doSomething
    // signature: doSomething()
    int doSomething() {
        System.out.println("Doing something without param");
        return 0;
    }

    // name: doSomething
    // signature: doSomething(String)
    String doSomething(String hello) {
        System.out.println("Doing something with return String");
        return "";
    }

}
