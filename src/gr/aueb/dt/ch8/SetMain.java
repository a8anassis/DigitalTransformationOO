package gr.aueb.dt.ch8;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        bag.add("apple");
        bag.add("banana");
        bag.add("apple");   // this is a duplicate - not allowed

        if (bag.contains("apple")) {
            bag.remove("apple");
        } else {
            System.out.println("Apple is not included in the bag.");
        }

        bag.forEach(el -> System.out.println(el));
        bag.forEach(System.out::println);
    }
}
