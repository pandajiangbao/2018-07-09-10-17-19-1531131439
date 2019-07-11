package practice09;

public class Student {
    private int Number;
    private String name;
    private int age;
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Student(int Number, String name, int age, Klass klass) {
        this.Number = Number;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        String string=this.klass.getLeader()==this?". I am Leader of "+this.klass.getDisplayName()+".":". I am at "+this.klass.getDisplayName()+".";
        return "My name is "+this.name+". I am "+this.age+" years old. I am a "+this.getClass().getSimpleName()+string;
    }
}