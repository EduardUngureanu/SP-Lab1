package src;

import java.util.Vector;

public class SubChapter {
    String name;
    Vector<Element> element_list;

    public SubChapter(String name) {
        this.name = name;
        this.element_list = new Vector<>();
    }

    public void addElement(Element element) {
        this.element_list.add(element);
    }

    public void print() {
        System.out.print("Subchapter: " + this.name);
        for(Element element : element_list) {
            System.out.print("\n");
            element.print();
        }
    }
}
