package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name, int age,int klass) {
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
        String string=this.klass!=0?"Class "+String.valueOf(this.klass)+".":"No Class.";
        return super.introduce()+" I am a "+this.getClass().getSimpleName()+". I teach "+string;
    }
}
