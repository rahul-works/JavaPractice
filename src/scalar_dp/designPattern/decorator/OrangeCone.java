package scalar_dp.designPattern.decorator;

public class OrangeCone implements IceCream{
    public OrangeCone(){

    }

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
