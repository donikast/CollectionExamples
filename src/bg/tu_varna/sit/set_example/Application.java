package bg.tu_varna.sit.set_example;

public class Application {
    public static void main(String[] args) {

        //Каталог 1 и 2
        Catalog catalog1 = new Catalog("New books summer 2022");
        Catalog catalog2 = new Catalog("New books autumn 2022");

        //Книги
        Book book1 = new Book("12345", "Отнесени от вихъра", 600);
        Book book2 = new Book("12346", "За мишките и хората", 500);
        Book book3 = new Book("12347", "Сто години самота", 400);

        //Добавяне с проверка за успех
        System.out.println(catalog1.addBook(book1));
        System.out.println(catalog1.addBook(book2));
        System.out.println(catalog1.addBook(book3));

        //Дублирана книга
        System.out.println(catalog1.addBook(book1));
        catalog1.showAvailableBooks();

        //Добавяне в каталог 2
        System.out.println(catalog2.addBook(book1));
        System.out.println(catalog2.addBook(book2));
        catalog2.showAvailableBooks();

   //Добавяне на останалите книги, union
        catalog2.addBooks(catalog1.getBooks());
        catalog2.showAvailableBooks();/* */

       //Общи книги, intersection
        catalog1.retainBooks(catalog2.getBooks());
        catalog1.showAvailableBooks();/* */

       //Разлика в книгите, difference
        System.out.println("Start here");

        catalog1.removeBooks(catalog2.getBooks());
        catalog1.showAvailableBooks();
    }
}
