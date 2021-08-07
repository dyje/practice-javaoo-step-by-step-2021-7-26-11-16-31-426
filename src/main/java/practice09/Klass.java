package practice09;

import practice08.Student;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int num;
    private Student leader;
    List<practice08.Student> students = new ArrayList<>();

    public Student getLeader() {
        return leader;
    }

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

    public void appendMember(Student member) {
        students.add(member);
    }
}
