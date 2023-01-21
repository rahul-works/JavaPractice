package scalar_dp.designPattern.decoratorPizza;

public class BBQChicken implements Pizza {
    public BBQChicken(){

    }

    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "BBQChicken";
    }
}
