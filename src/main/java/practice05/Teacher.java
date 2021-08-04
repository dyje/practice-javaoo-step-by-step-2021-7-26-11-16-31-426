package practice05;

public class Teacher extends Person {

    public int getKlass() {
        return klass;
    }
    private int klass;
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    public String introduce(){
        if (klass == 0){
            return super.introduce() + " I am a Teacher. " + "I teach No Class.";
        }else
        return super.introduce() + " I am a Teacher. " + "I teach Class " + klass + ".";
    }
}
