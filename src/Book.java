package src;

import java.util.LinkedList;

public class Book extends Section {
    LinkedList<Author> authors;

    public Book(String title) {
        super(title);
        this.authors = new LinkedList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void print() {
        System.out.print("Book: " + this.title + "\n\n");
        if (this.authors.size() > 1) {
            StringBuilder author_out = new StringBuilder();
            author_out.append("Authors: ");
            for (Author a : this.authors) {
                author_out.append(a.name);
                author_out.append("; ");
            }
            System.out.println(author_out);
        }
        else {
            this.authors.getFirst().print();
        }
        System.out.println();
        for (Element e : elements) {
            System.out.println();
            e.print();
        }
    }
}
