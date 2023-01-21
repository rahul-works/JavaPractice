package scalar_dp.oops4polymorphism;

public class Student extends User{
    public Student(String name, String email, String password) {
        super (name, email , password);
        System.out.println("Student Constructor - Start");
        System.out.println("Student Constructor - End");
    }
}
