package proiect_final_java.prob1_builder;

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer.ComputerBuilder("1TB", "8GB","Intel i10", "3080Ti").setGamingSpec(true).setNetworkConnection(true).build();
        Computer c2 = new Computer.ComputerBuilder("500GB", "4GB","AMD Ryzen", "rx5800").setGamingSpec(false).setNetworkConnection(true).build();
        c1.getDescription();
        c1.gamingTest();
        c1.netTest();
        c2.getDescription();
        c2.gamingTest();
        c2.netTest();

    }
}
