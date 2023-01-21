package scalar_dp.designPattern.decoratorPizza;

public class Farmhouse implements Pizza {
    public Farmhouse(){

    }

    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Farmhouse";
    }
}
