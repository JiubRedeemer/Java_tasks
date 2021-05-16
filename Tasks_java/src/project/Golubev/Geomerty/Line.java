package project.Golubev.Geomerty;

import java.util.Objects;

public class Line<T extends Point, Point3d> {
    public T start, end;
    private final String name;

    public Line(String name, T start, T end) throws Exception {
        if (start.getClass() != end.getClass()) throw new Exception("Points must be equals classes");
        this.start = start;
        this.end = end;
        this.name = name;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(T start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(T end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line " + name + " {" +
                "start=" + start.toString() +
                ", stop=" + end.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line<?, ?> line = (Line<?, ?>) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);


    }

    public static void move(Line<?, ?> line) {
        if (line.start.getX() >= 0)
            line.start.setX(line.start.getX() + 10);
        else line.start.setX(line.start.getX() - 10);

    }
}

