package gr.aueb.dt.ch8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        // explore API
        // Add
        cities.add("Athens");
        cities.add("London");

        // Get
        String city = cities.get(0);
        System.out.println(city);

        // Set - Update
        int position = cities.indexOf("London");
        if (position == -1) {       // element not found
            System.out.println("City not found");
        } else {
            cities.set(position, "Tokyo");
        }

        // Remove
        if (cities.contains("Tokyo")) {     // String has to implement the equals
            cities.remove("Tokyo");
        } else {
            System.out.println("City not found");
        }

        // Traverse a list
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        for (String c : cities) {
            System.out.println(c);
        }

        Iterator<String> iter = cities.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals("Tokyo")) {
                iter.remove();
            }
        }

        cities.removeIf(c -> c.equals("Tokyo"));

    }
}
