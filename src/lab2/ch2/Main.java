package lab2.ch2;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat("Oscar");
        Animal petCat=cat;
        cat.play();
        ((Cat)petCat).play();

    }
}
