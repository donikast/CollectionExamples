package bg.tu_varna.sit.list_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Archive {
    private List<Book> archivedBooks;

    public Archive() {
        archivedBooks = new ArrayList<>();
    }

    //Добавяне на копия в електронния архив
    public void addToArchive(List<Book> books) {
        archivedBooks.addAll(books);
        //archivedBooks.addAll(books.subList(0,2));
    }

    //Извеждане на всички книги2
    public void showAvailableBooks() {
        Iterator<Book> iterator = archivedBooks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
