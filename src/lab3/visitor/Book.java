package lab3.visitor;

public class Book implements Element {
    public Book(int numberOfPages,String name) {
        this.numberOfPages = numberOfPages;
        this.name= name;
    }

    private int numberOfPages;
    private String name;
    public void accept(Visitor v){
        v.visit(this);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getName() {
        return name;
    }
}
