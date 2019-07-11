package practice02;

public class Student extends Person{

    private int klass;

    public Student(String name, int age,int klass) {
        super(name, age);
        this.klass=klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce() {
        return "I am a "+this.getClass().getSimpleName()+". I am at Class "+this.klass+".";
    }
}
