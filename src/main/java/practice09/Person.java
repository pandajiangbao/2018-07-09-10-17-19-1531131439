package practice09;

import java.util.Objects;

public class Person {
    private int leader;
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public Person(int leader, String name, int age) {
        this.leader = leader;
        this.name = name;
        this.age = age;
    }

    public int getLeder() {
        return leader;
    }

    public void setLeder(int leader) {
        this.leader = leader;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return leader == person.leader &&
                age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leader, name, age);
    }

    public String introduce() {
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
}
