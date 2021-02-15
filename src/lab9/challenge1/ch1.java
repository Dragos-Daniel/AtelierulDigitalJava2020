package lab9.challenge1;
import reactor.core.publisher.Flux;

import java.io.IOException;


public class ch1 {
    public Flux<String> emptyFlux(){
        return Flux.empty();
    }

    public Flux<String> fooBarFromValues(){
        return Flux.just("foo", "bar");
    }

    public Flux<String> errorFlux(){
        return Flux.error(new IOException("Error"));
    }

    //public Flux<String> fooBarFromArray(){
        //return Flux.fromArray(A);
   // }
    public Flux<Integer> counter(){
        return Flux.range(0,9);
    }

}

