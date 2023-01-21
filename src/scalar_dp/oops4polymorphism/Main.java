package scalar_dp.oops4polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Student s1 = new Student("Rahul", "r@gmail.com", "123");
        Student s2 = new Student("Ketan", "k@gmail.com", "123");
        Mentor m = new Mentor("Sandeep", "s@gmail.com", "123");
        TA ta = new TA("Abhay", "a@gmail.com", "123");

        users.add(s1);
        users.add(s2);
        users.add(m);
        users.add(ta);

        printNames(users);
    }

    public static void printNames(List<User> users) {
        for(int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).name);
        }
    }
}
