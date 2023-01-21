package scalar_dp.designPattern.prototype;

// or Client.java
public class Main {
    public static StudentRegistry fillUpRegistry(StudentRegistry studentRegistry) {
        Student aprBatch = new Student();
        aprBatch.setAvgbatchPsp(80);
        aprBatch.setBatchName("Apr-LLD");
        aprBatch.setYearOfEnrollment(2022);
        studentRegistry.register(aprBatch);

        Student mayBatch = new Student();
        mayBatch.setAvgbatchPsp(90);
        mayBatch.setBatchName("May-LLD");
        mayBatch.setYearOfEnrollment(2021);
        studentRegistry.register(mayBatch);

        Student janBatch = new Student();
        janBatch.setAvgbatchPsp(99);
        janBatch.setBatchName("Jan-LLD");
        janBatch.setYearOfEnrollment(2020);
        studentRegistry.register(janBatch);

        IntelligentStudent intelligentAprBatch = new IntelligentStudent();
        intelligentAprBatch.setAvgbatchPsp(89);
        intelligentAprBatch.setBatchName("Intelligent-Apr-LLD");
        intelligentAprBatch.setYearOfEnrollment(2022);
        intelligentAprBatch.setIq(100);
        studentRegistry.register(intelligentAprBatch);

        return studentRegistry;
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry = fillUpRegistry(studentRegistry);

        Student aprBatchStudent = studentRegistry.get("Apr-LLD").clone();
        aprBatchStudent.setId(1);
        aprBatchStudent.setName("Jay");
        aprBatchStudent.setAge(23);


    }
}
