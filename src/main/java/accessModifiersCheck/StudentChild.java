package accessModifiersCheck;

import accessmodifiers.Student;

class StudentChild extends Student {

    public void doSomething() {
//        this.name = "Naman"; // private
//        this.batchId = 123; // ERROR: different package default
        psp = 91.0; // protected
        this.universityName = "Andaman"; // public

        StudentChild sc = new StudentChild();
        sc.psp = 91;

        Student st = new Student();
//        st.psp;
    }
}
