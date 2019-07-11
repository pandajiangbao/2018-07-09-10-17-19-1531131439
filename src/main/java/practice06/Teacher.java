package practice06;

public class Teacher {
    private String name;
    private int age;
    private int klass;

    public Teacher(String name, int age, int klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
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
        String string=this.klass!=0?"Class "+String.valueOf(this.klass)+".":"No Class.";
        return "My name is "+this.name+". I am "+this.age+" years old. I am a "+this.getClass().getSimpleName()+". I teach "+string;
    }
}
