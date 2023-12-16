package bg.tu_varna.sit.map_example2;

public class Application {
    public static void main(String[] args) {
        Exam exam = new Exam();

        WorkPlace wp1 = new WorkPlace("201TB", 1);
        WorkPlace wp2 = new WorkPlace("201TB", 5);
        WorkPlace wp3 = new WorkPlace("202TB", 1);
        WorkPlace wp4 = new WorkPlace("203TB", 1);

        Student student1 = new Student("1860112", "Петър Петров");
        Student student2 = new Student("1860016", "Иван Иванов");
        Student student3 = new Student("1860033", "Харалампи Груев");
        Student student4 = new Student("1860204", "Мая Петрова");

        exam.addStudent(wp3, student1);
        exam.addStudent(wp2, student2);
        exam.addStudent(wp4, student3);
        exam.addStudent(wp1, student4);

        System.out.println(exam.getExamList());

        exam.sortByWorkPlace();
        exam.sortByStudent();
    }
}
