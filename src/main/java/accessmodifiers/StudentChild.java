package accessmodifiers;

public class StudentChild extends Student {

    public void doSomething() {
//        this.name = "Naman"; // ERROR: private
        this.batchId = 123; // default
        this.psp = 91.0; // protected
        this.universityName = "Andaman"; // public
    }
}
