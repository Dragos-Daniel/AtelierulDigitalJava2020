package lab3.decorator;

public class Whip extends Toping {
    public Whip( Beverage wrappedBeverage) {
        super("Whip", 5, wrappedBeverage);
    }
}
