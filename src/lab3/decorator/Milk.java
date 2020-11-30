package lab3.decorator;

public class Milk extends Toping {
    public Milk( Beverage wrappedBeverage) {
        super("Milk", 3, wrappedBeverage);
    }
}
