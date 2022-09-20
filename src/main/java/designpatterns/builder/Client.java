package designpatterns.builder;

public class Client {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setAge(12);
        builder.setName("Naman");
        builder.setGradYear(2023);


        Student st = new Student(builder);
        System.out.println("DEBUG");
    }
}

// Break till 10:23 PM