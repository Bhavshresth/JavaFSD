package tech.codingclub;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test9 {

    public static void main(String[] args) {
        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("Test9 running at " + new Date().toString() + " Sharp.");

        Map<String, String> countryToCapital = new HashMap<String, String>();
        countryToCapital.put("India", "Delhi");
        countryToCapital.put("China", "Beijing");
        countryToCapital.put("Canada", "Ottawa");

        if (countryToCapital.containsKey("India")) {
            System.out.println("Capital of India :" + countryToCapital.get("India"));
        }
        if (countryToCapital.containsKey("Russia")) {
            System.out.println("Capital of Russia :" + countryToCapital.get("Russia"));
        } else {
            System.out.println("Capital of Russia is not present in the database");
        }
//        print all keys
        System.out.println("Keys Below");
        for (String key : countryToCapital.keySet()) {
            System.out.println(key);
        }
        System.out.println("Values Below");
        for (String x : countryToCapital.values()) {
            System.out.println(x);
        }


        System.out.println("#############");
        for (String key : countryToCapital.keySet()) {
            System.out.println(key + ":" + countryToCapital.get(key));
        }


        countryToCapital.remove("Canada");
        System.out.println("After Removing Canada");
        for (String key : countryToCapital.keySet()) {
            System.out.println(key + ":" + countryToCapital.get(key));
        }

        System.out.println("#######EntrySet#######");
        for (Map.Entry<String, String> x : countryToCapital.entrySet()) {
            System.out.println(x.getKey() + ":" + x.getValue());
        }

    }
}
