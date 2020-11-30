package lab3.factory;

public class Pizza {
    private String name;
    private String dough;

    public Pizza(String name,String dough){
        this.name=name;
        this.dough=dough;
    }
    public void bake(){
        System.out.println("Pizza is being baked");
    }

    public void slice(){
        System.out.println("Pizza is being sliced");
    }

    public void box(){
        System.out.println("Pizza is being boxed");
    }

    @Override
    public String toString(){
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                '}';

    }
}
