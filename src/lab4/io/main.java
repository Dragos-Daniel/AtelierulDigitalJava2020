package lab4.io;

public class main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./AtelierulDigitalJava2020/src/lab4/io/input.txt");
        //System.out.println(phoneBook);
        System.out.println("Abbey: " + phoneBook.getByName("Abbey"));
        System.out.println("Abdul: " + phoneBook.getByName("Abdul"));

    }
}
