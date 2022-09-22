package designpatterns.prototype;

public class IntelligentStudent extends Student {

    int iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent student) {
        super(student); // fill the attributes specific to parent
        this.iq = student.iq; // fill its own attributes
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}

// Overriding the clone is not going to do the work
// How to create a copy of a child class
