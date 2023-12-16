package bg.tu_varna.sit.map_example2;

import java.util.Objects;

public class Student implements Comparable<Object> {
    private String fn;
    private String name;

    public Student(String fn, String name) {
        this.fn = fn;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(fn, student.fn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fn);
    }

    @Override
    public int compareTo(Object o) {
       return this.fn.compareTo(((Student)o).fn);
    }

    @Override
    public String toString() {
        return "ФН: " +  fn + ", име: " + name;
    }
}
