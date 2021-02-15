package lab9.challenge1;

public class Main {
    public static void main(String[] args) {
        ch1 ch1 = new ch1();
        ch1.emptyFlux().subscribe(System.out::println);
        ch1.fooBarFromValues().subscribe(System.out::println);
        ch1.errorFlux().subscribe(System.out::println);
    }


}
