package practice11;

public class Student extends Person {
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass=klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass=klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        String string=this.klass.getLeader()==this?". I am Leader of "+this.klass.getDisplayName()+".":". I am at "+this.klass.getDisplayName()+".";
        return super.introduce()+" I am a "+this.getClass().getSimpleName()+string;
    }
}