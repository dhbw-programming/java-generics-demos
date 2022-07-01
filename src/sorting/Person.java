package sorting;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + name + " is " + age + " years old";
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
        // return this.name.compareTo(o.name);
    }
}
