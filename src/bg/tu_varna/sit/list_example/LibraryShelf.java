package bg.tu_varna.sit.list_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryShelf {
    private String sectorId;
    private List<Book> books;

    public LibraryShelf(String sectorId) {
        this.sectorId = sectorId;
        books = new ArrayList<>();
    }

    public String getSectorId() {
        return sectorId;
    }

    public void setSectorId(String sectorId) {
        this.sectorId = sectorId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    // Добавяне на нова книга
    public void addBook(Book book) {
        books.add(book);
    }

    //Проверка за наличност
    public boolean isBookAvailable(Book book) {
        return books.contains(book);
    }

    //Извеждане на всички книги
    public void getAvailableBooks() {
        if(!books.isEmpty()) {
            for(Book b:books) {
                System.out.println(b);
            }
        }
    }

    //Извеждане на всички книги с итератор
    public void getAvailableBooks2() {
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
     }

    //Премахване на книга при първо срещане
    public void removeBook(Book book) {
        if(!books.isEmpty()) {
            for(Book b:books) {
                if (b.equals(book)) {
                    books.remove(b);
                    break; //return;
                }
            }
        }
    }

    //Премахване на книга
    public void removeBook2(Book book) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book currentBook = iterator.next();
            if(currentBook.equals(book))
                iterator.remove();
        }
    }

    public void sortByPagesAndIsbn() {
        books.sort(Book::compareTo);
    }

    //Сортиране на книгите по заглавие
    public void sortByTitle() {
        //Collections.sort(books, new SortByTitle());
        books.sort(new SortByTitle());
    }
}