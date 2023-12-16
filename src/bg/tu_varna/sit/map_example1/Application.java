package bg.tu_varna.sit.map_example1;

public class Application {
    public static void main(String[] args) {

        Group group = new Group("3a");

        //Добавяне на студенти
        group.addStudent("1860112", "Петър Петров");
        group.addStudent("1860016", "Иван Иванов");
        group.addStudent("1860033", "Харалампи Груев");
        group.addStudent("1860204", "Мая Петрова");
        group.addStudent("1860005", "Михаил Колев");
        System.out.println(group.getStudents());

        //Търсене на студент по ФН - дали съществува
        System.out.println(group.searchByFn("1860005"));

        //Търсене на студент по име - дали съществува
        System.out.println(group.searchByName("Харалампи Груев"));

        //Търсене на студент по ФН и връщане на име
        System.out.println(group.getStudentByFn("1860005"));

        //Изтриване на студент
        group.removeStudent("1860005");
        System.out.println(group.getStudents());

        //Преименуване на студент
        group.renameStudent("1860004", "Мая Петрова-Недева");
        System.out.println(group.getStudents());

        //Извеждане на всички факултетни номера
        System.out.println(group.listFns());

        //Извеждане имената на всички студенти
        System.out.println(group.listNames());

        //Извеждане на пълна информация за студентите
        group.listStudents2();

        //Сортиране
        group.sortStudentsByFn();
        group.sortStudentsFn();
        group.sortStudentsNames();
    }
}
