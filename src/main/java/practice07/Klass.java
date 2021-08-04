package practice07;

import java.text.MessageFormat;

public class Klass {
    private final int num;

    public Student getLeader() {
        return leader;
    }
    private Student leader;

    public Klass(int num) {
        this.num = num;
    }
    public int getNumber() {
        return num;
    }
    public String getDisplayName() {
        return MessageFormat.format("Class {0}", num);
    }

    public void assignLeader(Student student){
        this.leader = student;
    }
}
