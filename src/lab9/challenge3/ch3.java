package lab9.challenge3;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class ch3 {
    private static List<String> words = Arrays.asList("the","quick",
            "brown","fox","jumped","over","the","lazy","dog");

    public void displayLetters(){
         Flux.fromIterable(words).flatMap(word ->
                Flux.fromArray(word.split("")))
                 .subscribe(System.out::println);
    }

    public void sortLetters(){
        Flux.fromIterable(words).flatMap(word ->
                Flux.fromArray(word.split("")))
                .sort()
                .distinct()
                .subscribe(System.out::println);
    }
}

