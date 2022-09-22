package designpatterns.prototype;

public class Client {

    public static void fillRegistry(StudentRegistry registry) {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("April 21");
        aprBatchStudent.setAverageBatchPsp(89.0);

        registry.register("april21Batch", aprBatchStudent);

        IntelligentStudent aprBatchIntelligentStudent = new IntelligentStudent();
        aprBatchIntelligentStudent.iq = 180;
        aprBatchIntelligentStudent.setBatch("April 21");
        aprBatchIntelligentStudent.setAverageBatchPsp(89.0);

        registry.register("aprBatchIntelligentStudent", aprBatchIntelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);


        Student siddharth = studentRegistry.get("april21Batch").clone();
        siddharth.setName("Siddharth");
        siddharth.setAge(24);
        siddharth.setStudentPsp(91.0);

        Student intelligentSiddharth = studentRegistry.get("aprBatchIntelligentStudent").clone();
        intelligentSiddharth.setName("Siddharth");
        intelligentSiddharth.setAge(24);
        intelligentSiddharth.setStudentPsp(91.0);

        System.out.println("Debug");
    }
}
