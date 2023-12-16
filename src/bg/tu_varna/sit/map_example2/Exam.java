package bg.tu_varna.sit.map_example2;

import java.util.*;

public class Exam {
    private Map<WorkPlace, Student> examList = new HashMap<>();

    public Map<WorkPlace, Student> getExamList() {
        return examList;
    }

    public void addStudent(WorkPlace wp, Student student) {
        examList.put(wp, student);
    }

    public void sortByWorkPlace() {
        Map<WorkPlace,Student> sorted = new TreeMap<>(examList);
        System.out.println(sorted);
    }

    public void sortByStudent() {
        List<Student> sorted = new ArrayList<>(examList.values());
        Collections.sort(sorted);
        System.out.println(sorted);
    }
}
