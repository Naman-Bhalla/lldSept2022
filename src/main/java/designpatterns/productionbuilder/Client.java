package designpatterns.productionbuilder;

public class Client {

    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setAge(12);
//        builder.setName("Naman");
//        builder.setGradYear(2023);
//        Student st = builder.build();

//        Student st = new Student(null);

        Student st1 = Student.getBuilder()
                        .setAge(12)
                        .setName("Naman")
                        .setGradYear(2021)
                        .build();

        System.out.println("DEBUG");
    }
}

// Break till 10:23 PM
// refactoring.guru and sourcemaking