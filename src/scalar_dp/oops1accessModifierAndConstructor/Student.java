package scalar_dp.oops1accessModifierAndConstructor;

public class Student {
    public String name;
    String address;
    public int age;
    public String email;
    String batch;
    double psp;
    String state;

    // default Constructor
    public Student(){

    }

    // custom Constructor
    public Student(String studentName, int studentAge, double studentPsp) {
        name = studentName;
        age = studentAge;
        psp = studentPsp;
    }

    void solveProblem() {
        System.out.println("Student is solving problem");
        psp++;
    }

    void pauseCourse() {
        System.out.println("Student has paused course");
        state = "PAUSED";
    }
}
