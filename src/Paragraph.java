package src;

public class Paragraph implements Element{
    String name;

    public Paragraph(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.print("Paragraph: " + this.name);
    }
}
