package practice06;


public class Teacher extends Person {

    public Klass getKlass() {
        return klass;
    }
    public Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    public String introduce(){
        if (this.getKlass() == null){
            return super.introduce() + " I am a Teacher. " + "I teach No Class.";
        }else
            return super.introduce() + " I am a Teacher. " + "I teach Class " + klass.getNumber() + ".";
    }

    public String introduceWith(Student student){
        String teacher = super.introduce() + " " + "I am a Teacher. ";
        if (student.getKlass().getNumber() == (this.getKlass().getNumber())) {
            return String.format(teacher + "I teach %s.", student.getName());
        }else{
            return String.format(teacher + "I don't teach %s.", student.getName());
        }
    }
}
