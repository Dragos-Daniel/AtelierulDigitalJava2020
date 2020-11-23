package lab2.ch2;

public class Fish extends Animal implements Pet{
    private String name;
    public Fish(){
        super(0);
    }

    public Fish(String name){
        super(0);
        setName(name);
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
     public void play(){
         System.out.println("Play like a fish.. swim?");
     }

     public void eat(){
        super.eat();
         System.out.print(" like a fish");
     }

    public void walk(){
        super.walk();
        System.out.print(" like a fish");
    }
}
