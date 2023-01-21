package scalar_dp.oops2deepAndShallowCopy;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul Thakur", 37, 100);
        Student s2 = s1; //Shallow copy
        Student s3 = new Student(s1); //Deep copy
        s1.age = 20;
        s2.age = 30;
        System.out.println(s1.age);
    }
}
