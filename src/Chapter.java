package src;

import java.util.Vector;

public class Chapter {
    String name;
    Vector<SubChapter> subChapter_list;
    Vector<Element> element_list;

    public Chapter(String name) {
        this.name = name;
        this.subChapter_list = new Vector<>();
        this.element_list = new Vector<>();
    }

    public int createSubChapter(String name) {
        subChapter_list.add(new SubChapter(name));
        return subChapter_list.indexOf(subChapter_list.lastElement());
    }

    public SubChapter getSubChapter(int index) {
        return subChapter_list.get(index);
    }

    public void print() {
        System.out.print("Title: " + this.name);
        for(SubChapter subChapter : subChapter_list) {
            System.out.println();
            subChapter.print();
        }
    }
}
