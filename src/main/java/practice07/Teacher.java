package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age,Klass klass) {
        super(name, age);
        this.klass=klass;
    }
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        String string=this.klass!=null?this.klass.getDisplayName()+".":"No Class.";
        return super.introduce()+" I am a "+this.getClass().getSimpleName()+". I teach "+string;
    }

    public String introduceWith(Student jerry) {
        String string=this.klass.getNumber()!=jerry.getKlass().getNumber()?"don't teach "+jerry.getName()+".":"teach "+jerry.getName()+".";
        return super.introduce()+" I am a Teacher. I "+string;
    }
}
