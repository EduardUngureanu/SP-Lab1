package src;

import java.util.LinkedList;

public class Image implements Element {
    String name;
    LinkedList<Element> elements;

    public Image(String name) {
        this.name = name;
        this.elements = new LinkedList<>();
    }

    @Override
    public void print() {
        System.out.print("Image with name: " + this.name);
        for(Element e : elements) {
            System.out.println();
            e.print();
        }
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int index) {
        return elements.get(index);
    }
}