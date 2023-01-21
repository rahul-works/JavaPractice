package scalar_dp.designPattern.decorator;

public class ChocolateCone implements IceCream{
    private IceCream iceCream;

    public ChocolateCone() {

    }

    public  ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream == null) {
            return 20;
        } else {
            return iceCream.getCost()+20;
        }
    }

    @Override
    public String getDescription() {
        if (iceCream == null) {
            return "Chocolate Cone";
        } else {
            return iceCream.getDescription() + " Chocolate Cone";
        }
    }
}

/*
      Choose a cone :
       1. Orange Cone, 2. Chocolate
       1 -> IceCream ic = new OrangeCone();
       Choose a topping :
       1. Chocolate Cone 2. Chocolate Syrup 3. Vanilla Scoop 4. Chocolate Scoop
       2. -> ic = new ChocolateSyrup(ic);
       Choose a topping :
       1. Chocolate Cone 2. Chocolate Syrup 3. Vanilla Scoop 4. Chocolate Scoop
       3. ic = new VanillaScoop(ic);
 */
