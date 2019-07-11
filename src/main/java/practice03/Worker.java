package practice03;

public class Worker extends Person {

    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce() {
        return "I am a "+this.getClass().getSimpleName()+". I have a job.";
    }
}
