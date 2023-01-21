package scalar_dp.designPattern.prototype;

public class Student implements Prototype<Student>{
    private int id;
    private String name;
    private int age;
    private double avgbatchPsp;
    private String batchName;
    private int yearOfEnrollment;

    public Student(Student student) {
        this.avgbatchPsp = student.avgbatchPsp;
        this.batchName = student.batchName;
        this.yearOfEnrollment = student.yearOfEnrollment;
    }

    public Student() {

    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgbatchPsp() {
        return avgbatchPsp;
    }

    public void setAvgbatchPsp(double avgbatchPsp) {
        this.avgbatchPsp = avgbatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }
}
