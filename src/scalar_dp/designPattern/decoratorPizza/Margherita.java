package scalar_dp.designPattern.decoratorPizza;

public class Margherita implements Pizza {
    public Margherita(){

    }

    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Margherita";
    }
}
