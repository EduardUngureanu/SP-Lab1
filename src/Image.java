package src;

public class Image implements Element {
    String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.print("Image with name: " + this.name);
    }
}
