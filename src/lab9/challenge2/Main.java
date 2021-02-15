package lab9.challenge2;

import org.reactivestreams.Subscriber;

public class Main {
    public static void main(String[] args) {
        ch2 ch= new ch2();
        Subscriber subscriber = new PrintSubscriber<String>();
        ch.emptyMono().subscribe(subscriber);
        //ch.monoWithNoSignal().subscribe(subscriber);
        ch.fooMono().subscribe(subscriber);
        //ch.errorMono().subscribe(subscriber);

    }
}
