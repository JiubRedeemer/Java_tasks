package project.Golubev.Students;

import java.util.Arrays;

public class Student {
    private String name;
    public int[] marks;

    public Student(String name, int...marks) throws Exception {

        this.name = name;
        for (int mark : marks) {
            if (mark < 2 || mark > 5) throw new Exception("Оценка должна быть от 2 до 5");
        }
        this.marks = marks;
    }


    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public double average() {
        if (marks.length > 0) {
            int sum = 0;
            for (int mark : marks) {
                sum += mark;
            }
            return (double) sum / (double) marks.length;
        }
        return 0.0;
    }

    public boolean isExcellent() {
        return marks.length > 0 && average() == 5.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
