package scalar_dp.oops3passByValVsPassByRef;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 30, 100);
        updateStudent(s);
        System.out.println(s == null);
        System.out.println(null == null);
        System.out.println(s.age);
    }

    public static void updateStudent(Student obj) {
        obj.age = 32;
        obj = null; // this is the Subtle difference between Java is Reference
    }
}
