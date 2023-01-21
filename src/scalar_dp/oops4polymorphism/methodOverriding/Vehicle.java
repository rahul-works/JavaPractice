package scalar_dp.oops4polymorphism.methodOverriding;

public class Vehicle {
    public void startEngine(){
        System.out.println("Check engine temp");
        System.out.println("Check door open or not");
        System.out.println("Check brake and clutch pressed or not");
    }

    public void startEngine(int engineSize){
        System.out.println("Engine Szie"+engineSize);
        System.out.println("Check engine temp");
        System.out.println("Check door open or not");
        System.out.println("Check brake and clutch pressed or not");
    }

    public void blowHorn() {
        System.out.println("Blowing horn in Vehicle class");
    }
}
