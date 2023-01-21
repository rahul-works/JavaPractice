package scalar_dp.oops4polymorphism.methodOverloading;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(123);
        System.out.println(true);

        add(1, 2);

        Calculator c = new Calculator();
        c.add(1, 2);
        c.add(1, 2.1);
        c.add(1.1, 2);
        c.add(1.1, 2.1);
    }

    public static void add(int a, int b) {
        System.out.println(a+b);
    }
}
