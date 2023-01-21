package scalar_dp.designPattern.decoratorPizza;

public class Client {
    public static void main(String[] args) {
        Pizza p = new Paneer(
                new Cheese(
                        new Tomato(
                                new BBQChicken()
                        )
                )
        );
        System.out.println(p.getCost());
        System.out.println(p.getDescription());
    }
}
