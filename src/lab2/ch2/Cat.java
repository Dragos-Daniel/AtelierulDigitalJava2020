package lab2.ch2;

public class Cat extends Animal implements Pet {
    private String name;
    public Cat() {
        super(4);
    }

    public Cat(String name){
        super(4);
        setName(name);
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void play(){
        System.out.println("Play like a cat.");
    }

    public void eat(){
        super.eat();
        System.out.print(" like a cat");
    }

    public void walk(){
        super.walk();
        System.out.print(" like a cat");
    }
}
