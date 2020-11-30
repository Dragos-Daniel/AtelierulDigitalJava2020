package lab3.decorator;

public class Chocolate extends Toping {
    public Chocolate( Beverage wrappedBeverage) {
        super("Chocolate", 6, wrappedBeverage);
    }
}
