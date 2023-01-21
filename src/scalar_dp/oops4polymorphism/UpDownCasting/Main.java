package scalar_dp.oops4polymorphism.UpDownCasting;

public class Main {
    public static void main(String[] args) {
        Animal animalDog = new Dog(); // upCasting, implicit casting
//        Dog dogAnimal = (Dog)new Animal(); // DownCasting, explicit casting
        // Dont do and not possible

        animalDog.eats();
        animalDog.breathes();
    }
}
