package lab3.factory;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        PizzaStore chPizzaStore=new ChicagoPizzaStore();
        PizzaStore nyPizzaStore=new NYPizzaStore();

        Pizza p1=chPizzaStore.orderPizza("CHMargherita");
        Pizza p2=nyPizzaStore.orderPizza("NYMargherita");
        System.out.println(p1);
        System.out.println(p2);

    }
}
