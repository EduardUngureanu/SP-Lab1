package src;

import java.util.LinkedList;

public class Section implements Element {
    String title;
    LinkedList<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new LinkedList<>();
    }

    @Override
    public void print() {
        System.out.print(title);
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
