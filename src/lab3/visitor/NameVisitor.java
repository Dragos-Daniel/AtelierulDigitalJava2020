package lab3.visitor;

public class NameVisitor implements Visitor{
    String allNames="";

    @Override
    public void visit(Book book) {
        allNames+=book.getName() + " book, ";
    }

    @Override
    public void visit(Audio audio) {
        allNames+= audio.getName() + " audio, ";
    }

    @Override
    public void visit(Video video) {
        allNames+= video.getName() + " video, ";
    }

    @Override
    public String toString() {
        return allNames;
    }
}
