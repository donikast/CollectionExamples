package bg.tu_varna.sit.map_example1;

import java.util.*;

public class Group {
    private String groupId;
    //ФН:име
    private Map<String, String> students = new HashMap<>();

    public Group(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Map<String, String> getStudents() {
        return students;
    }

    public void setStudents(Map<String, String> students) {
        this.students = students;
    }

    //Метод за добавяне на нов студент
    public void addStudent(String fn, String name) {
        students.put(fn, name);
    }

    //метод за премахване на съществуващ студент
    public void removeStudent(String fn) {
        students.remove(fn);
    }

    //Метод за достъпване на името на студента по подаден ФН
    public String getStudentByFn(String fn) {
        return students.get(fn);
    }

    //Търсене дали съществува студент с подаден ФН
    public boolean searchByFn(String fn) {
        return students.containsKey(fn);
    }

    //Търсене дали съществува студент с подадено име
    public boolean searchByName(String name) {
        return students.containsValue(name);
    }

    //метод за преименуване на съществуващ студент
    public void renameStudent(String fn, String name) {
        if (students.containsKey(fn)) {
            students.replace(fn, name);
        }
    }

    //Метод за извеждане на всички ФН на един ред
    public String listFns() {
        StringBuilder sb = new StringBuilder();
        Set<String> fns = students.keySet();
        for (String fn : fns) {
            sb.append(fn);
            sb.append(" ");
        }
        return sb.toString();
    }

    //Метод за извеждане на всички имена на един ред
    public String listNames() {
        StringBuilder sb = new StringBuilder();
        Collection<String> names = students.values();
        for (String name : names) {
            sb.append(name);
            sb.append(" | ");
        }
        return sb.toString();
    }

    //Обхождане едновременно на ключове и стойности
    public void listStudents() {
        Set<Map.Entry<String, String>> entries = students.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("ФН: " + entry.getKey() + ", " +
                    "име: " + entry.getValue());
        }
    }

    //обхождане с итератор
    public void listStudents2() {
        Iterator<Map.Entry<String, String>> iterator =
                students.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("ФН: " + entry.getKey() + ", име: " + entry.getValue());
        }
    }

    //Сортиране 1
    public void sortStudentsByFn() {
        TreeMap<String, String> sorted = new TreeMap<>(students);
        System.out.println(sorted);
    }

    //Сортиране 2
    public void sortStudentsFn() {
        List<String> sorted = new ArrayList<>(students.keySet());
        Collections.sort(sorted);
        System.out.println(sorted);
    }

    //Сортиране 3
    public void sortStudentsNames() {
        List<String> sorted = new ArrayList<>(students.values());
        Collections.sort(sorted);
        System.out.println(sorted);
    }
}

