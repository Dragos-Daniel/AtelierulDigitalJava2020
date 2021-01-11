package lab8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    static String ex1(){
        List<String> inputList = Arrays.asList("Hello","End", "Long", "Light", "Ostropel");
        StringBuilder sb = new StringBuilder();
        inputList.forEach(s -> sb.append(s.charAt(0)));
        return sb.toString();
    }
    static void ex2(){
        List<String> inputList = new ArrayList(Arrays.asList("Hello","End", "Long", "Light", "Ostropel"));
        inputList.removeIf(s -> s.length() %2 != 0);
        System.out.println(inputList);
    }
    static void ex3(){
        List<String> inputList = new ArrayList(Arrays.asList("Hello","End", "Long", "Light", "Ostropel"));
        inputList.replaceAll(String:: toUpperCase);
        System.out.println(inputList);
    }
    static void ex4(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Uno");
        map.put("2", "Duoi");
        map.put("3", "Threi");

        StringBuilder sb1 = new StringBuilder();
        map.forEach((key , value) -> sb1.append(key).append(value));
        System.out.println(sb1);
    }

    static void ex5(){
        List<Integer> inputList = Arrays.asList(1,2,3,4,5);
        Thread t = new Thread(() -> inputList.forEach(System.out::print));
        t.start();


    }
    public static void main(String[] args) {
        System.out.println(ex1());
        ex2();
        ex3();
        ex4();
        ex5();
    }

}
