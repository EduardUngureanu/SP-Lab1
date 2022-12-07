package src;

public class ImageProxy implements Element {
    String name;
    Image realimg = null;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        loadImage();
        realimg.print();
    }

    @Override
    public void add(Element element) {
        loadImage();
        realimg.add(element);
    }

    @Override
    public void remove(Element element) {
        loadImage();
        realimg.remove(element);
    }

    @Override
    public Element get(int index) {
        loadImage();
        return realimg.get(index);
    }

    void loadImage() {
        if (realimg == null) {
            realimg = new Image(name);
        }
    }
}
