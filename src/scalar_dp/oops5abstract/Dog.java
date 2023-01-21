package scalar_dp.oops5abstract;

public class Dog extends Animal{
    public Dog(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
