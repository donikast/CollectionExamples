package bg.tu_varna.sit.set_example;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String ISBN;
    private String title;
    private int pages;

    public Book(String ISBN, String title, int pages) {
        this.ISBN = ISBN;
        this.title = title;
        this.pages = pages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return ISBN.equals(book.ISBN);
    }
//!!!!!
    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }

    @Override
    public String toString() {
        return  "ISBN: " + ISBN +
                ", title: " + title +
                ", pages: " + pages;
    }

    @Override
    public int compareTo(Book o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
