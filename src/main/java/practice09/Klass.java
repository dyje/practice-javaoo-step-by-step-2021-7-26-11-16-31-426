package practice09;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private final int num;
    private Student leader;
    List<Student> students = new ArrayList<>();


    public Klass(int num) {
        this.num = num;
    }

    public int getNumber() {
        return num;
    }

    public String getDisplayName() {
        return MessageFormat.format("Class {0}", num);
    }

    public void assignLeader(Student leader) {
        if (students.contains(leader)){
            this.leader = leader;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }

    public boolean isIn(Student student)
    {
        return this.equals(student.getKlass());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Klass)) return false;
        Klass klass = (Klass) o;
        return num == klass.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student member) {
        students.add(member);
    }
}
