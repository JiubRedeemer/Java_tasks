package project.Golubev.Students;

import project.Golubev.Collections.ChangeableArray;

import java.util.Arrays;

public class StudentWithChangeableArray {
    private String name;
    public ChangeableArray marks = new ChangeableArray();
    public StudentWithChangeableArray(String name, int...marks) throws Exception {
        if(name.length()<1) throw new Exception("Студент должен иметь имя");
        this.name = name;

        for (int mark : marks) {
            if (mark < 2 || mark > 5) throw new Exception("Оценка должна быть от 2 до 5");
        }
        this.marks.setArr(marks);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks.getArr();
    }

    public void setMarks(int[] marks) {
        for (int mark : marks) {
            if (mark < 2 || mark > 5) throw new IllegalArgumentException();
        }
        this.marks.setArr(marks);
    }

    public double average() {
        if (marks.length() > 0) {
            int sum = 0;
            for(int i = 0; i<marks.length(); i++){
                sum += marks.get(i);
            }
            return (double) sum / (double) marks.length();
        }
        return 0.0;
    }

    public boolean isExcellent() {
        return marks.length() > 0 && average() == 5.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks.getArr()) +
                '}';
    }
}
