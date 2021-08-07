package practice09;


import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private LinkedList<Klass> klasses;

    public Teacher(int id, String name, int age) {
        super(id, name, age);

    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public String teacher = super.introduce() + " " + "I am a Teacher. ";

    public String introduce() {
        if (klasses != null)
            return String.format(teacher + "I teach Class %s.", klasses.stream().map(klassVal -> String.valueOf(klassVal.getNumber())).collect(Collectors.joining(", ")));
        else
            return teacher + "I teach No Class.";
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return String.format(teacher + "I teach %s.", student.getName());
        } else
            return String.format(teacher + "I don't teach %s.", student.getName());
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public boolean isTeaching(Student student) {
        return klasses.stream().anyMatch(klass->klass.isIn(student));
    }
}
