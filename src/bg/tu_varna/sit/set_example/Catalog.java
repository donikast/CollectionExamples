package bg.tu_varna.sit.set_example;

import java.util.*;

public class Catalog {
    private String title;
    private Set<Book> books = new HashSet<>();

    public Catalog(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean addBook(Book book) {
        return books.add(book);
    }

    //Извеждане на всички книги
    public void showAvailableBooks() {
        if (!books.isEmpty()) {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    //Извеждане на всички книги2
    public void showAvailableBooks2() {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void addBooks(Set<Book> b) {
        books.addAll(b);
    }

    public void retainBooks(Set<Book> b) {
        books.retainAll(b);
    }

    public void removeBooks(Set<Book> b) {
        books.removeAll(b);
    }

    public List<Book> getBooksSortedByTitle() {
        List<Book> bookList = new ArrayList<>(books);
        bookList.sort(Book::compareTo);
        return bookList;
    }
}
