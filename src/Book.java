package src;

import java.util.Vector;

public class Book {
    String title;
    Vector<Chapter> chapter_list;
    Vector<Author> author_list;

    public Book(String title) {
        this.title = title;
        this.chapter_list = new Vector<>();
        this.author_list = new Vector<>();
    }

    public void addAuthor(Author author) {
        this.author_list.add(author);
    }

    public int createChapter(String name) {
        chapter_list.add(new Chapter(name));
        return chapter_list.indexOf(chapter_list.lastElement());
    }

    public Chapter getChapter(int index) {
        return chapter_list.get(index);
    }

    public void print() {
        System.out.println("Title: " + this.title);
        if(this.author_list.size() > 1) {
            StringBuilder author_out = new StringBuilder();
            author_out.append("Authors: ");
            for(Author author : this.author_list) {
                author_out.append(author.name);
                author_out.append("; ");
            }
            System.out.println(author_out);
        } else {
            this.author_list.firstElement().print();
        }
        System.out.println();
        for(Chapter chapter : chapter_list) {
            chapter.print();
        }
    }
}
