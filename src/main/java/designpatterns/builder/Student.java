package designpatterns.builder;

public class Student {
    String name;
    int age;
    double psp;
    String universityName;
    String batch;
    long id;
    int gradYear;
    String phoneNumber;

//    Student(String name, int age, String universityName, ...) {
//
//    }

    Student(Builder builder) {
        // validation starts
        if (builder.getGradYear() > 2022) {
            throw new IllegalArgumentException("Grad year cannot be greater than 2022");
        }
        // validation completed

        this.gradYear = builder.getGradYear();
        this.age = builder.getAge();
        this.name = builder.getName();
    }
}
