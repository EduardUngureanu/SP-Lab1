package src;

public class Table implements Element {
    String name;

    public Table(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.print("Table with name: " + this.name);
    }
}
