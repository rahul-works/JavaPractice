package scalar_dp.designPattern.decorator;

public class VanillaScoop implements IceCream{
    private IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+20;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+ " Vanilla Scoop";
    }
}
