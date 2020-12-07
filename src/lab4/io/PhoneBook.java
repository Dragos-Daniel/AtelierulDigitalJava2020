package lab4.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    HashMap<String,Long>  phoneNumbers= new HashMap<>();

    public PhoneBook(String phoneBook){
        try{
            String name;
            Long number;
            Scanner scanner= new Scanner(new BufferedReader(new FileReader(phoneBook)));
            while (scanner.hasNext()){
                name = scanner.next();
                if(scanner.hasNextLong()){
                    phoneNumbers.put(name, scanner.nextLong());
                }
            }
        }catch (Exception e){
            System.out.println("NOT FOUND");
        }
    }
    public String toString(){
        return phoneNumbers.toString();
    }

    public Long getByName(String name){
        return phoneNumbers.get(name);

    }

}
