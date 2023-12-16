package bg.tu_varna.sit.list_example;

import java.util.Objects;

public class Book implements Comparable<Object>{
    private String ISBN;
    private String title;
    private int pages;

    public Book(String ISBN, String title, int pages) {
        this.ISBN = ISBN;
        this.title = title;
        this.pages = pages;
    }

    public Book(String ISBN) {
        this.ISBN = ISBN;
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
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(ISBN, book.ISBN) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title, pages);
    }

    @Override
    public int compareTo(Object o) {
        //return this.ISBN.compareTo(((Book)o).ISBN);

          // first criteria is pages, second - ISBN
     int pagesResult = this.pages - ((Book)o).pages;
        if (pagesResult == 0) {
            return this.ISBN.compareTo(((Book)o).ISBN);
        }
        return pagesResult;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
