package practice07;

public class Student {
    private String name;
    private int age;
    private int klass;

    public Student(String name, int age, int klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Student(String tom, int age, Klass klass) {
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

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce() {
        return "My name is "+this.name+". I am "+this.age+" years old. I am a "+this.getClass().getSimpleName()+". I am at Class "+this.klass+".";
    }
}