package gr.aueb.dt.ch8;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        // Add & update
        countries.put("GR", "Greece");
        countries.put("USA", "UnitedStates");

        // Get
        String country = countries.get("GR");

        // Remove
        countries.remove("USA");

//        countries.forEach(countries.entrySet());
    }
}
