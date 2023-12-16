package bg.tu_varna.sit.list_example;


public class Application {
    public static void main(String[] args) {

        //Създаване на рафт
        LibraryShelf ls = new LibraryShelf("5a");

        //Книги
        Book book1 = new Book("12345", "Отнесени от вихъра", 600);
        Book book2 = new Book("12346", "За мишките и хората", 500);
        Book book3 = new Book("12347", "Сто години самота", 400);

        //Добавяне на книгите
        ls.addBook(book1);
        ls.addBook(book2);
        ls.addBook(book3);

        //Дублиране на книга
        ls.addBook(book1);

        //Извеждане на книгите
        ls.getAvailableBooks();

        //Търсене
        Book searchedBook = new Book("12345");
        System.out.println(ls.isBookAvailable(searchedBook));

        //Премахване
        ls.removeBook(searchedBook); //ls.removeBook2(searchedBook);
        ls.getAvailableBooks();

        //Повторно добавяне
        ls.addBook(book1);
        ls.getAvailableBooks2();

        //Сортиране
        System.out.println("Сортиране по страници и ISBN");
        ls.sortByPagesAndIsbn();
        ls.getAvailableBooks();

        System.out.println("Сортиране по заглавие");
        ls.sortByTitle();
        ls.getAvailableBooks();

        System.out.println("Електронен архив");
        //Електронен архив
        Archive archive = new Archive();
        archive.addToArchive(ls.getBooks());
        archive.showAvailableBooks();

        //Достъпване на първи  и последен елемент от колекцията
        System.out.println(ls.getBooks().get(0));
        System.out.println(ls.getBooks().get(ls.getBooks().size()-1));
    }
}
