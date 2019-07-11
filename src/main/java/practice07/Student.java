package practice07;

public class Student {
    private String name;
    private int age;
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
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
        return "My name is "+this.name+". I am "+this.age+" years old. I am a "+this.getClass().getSimpleName()+". I am at "+this.klass.getDisplayName()+".";
    }
}