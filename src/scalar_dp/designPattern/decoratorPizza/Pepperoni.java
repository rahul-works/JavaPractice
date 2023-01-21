package scalar_dp.designPattern.decoratorPizza;

public class Pepperoni implements Pizza {
    public Pepperoni(){

    }

    @Override
    public int getCost() {
        return 180;
    }

    @Override
    public String getDescription() {
        return "Pepperoni";
    }
}
