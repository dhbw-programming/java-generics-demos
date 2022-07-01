package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingMain {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("carl", 25));
        persons.add(new Person("judy", 20));
        persons.add(new Person("arnold", 35));

        Collections.sort(persons);

        System.out.println(persons);
    }
}
