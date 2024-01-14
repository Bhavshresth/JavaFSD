package tech.codingclub;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("SetExample class running at " + new Date().toString() + " Sharp.");

        ArrayList<String> emails = new ArrayList<String>();
        emails.add("contact@codingclub.tech");
        emails.add("admin@google.com");
        emails.add("admin@linkedin.com");
        emails.add("admin@google.com");
        emails.add("contact@codingclub.tech");
        emails.add("admin@linkedin.com");
        emails.add("admin@tiktok");
        emails.add("admin@linkedin.com");

        ArrayList<String> blackList = new ArrayList<String>();
        blackList.add("admin@tiktok");
        blackList.add("hr@tiktok");


        Set<String> uniqueEmail = new HashSet<String>();
        uniqueEmail.add("hr@google.com");
        uniqueEmail.addAll(emails);


        Iterator<String> iterator = uniqueEmail.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator Showing : " + iterator.next());
        }

        for (String x : uniqueEmail) {
            System.out.println("For loop Showing : " + x);
        }

        System.out.println("Size of set: " + uniqueEmail.size());
        uniqueEmail.remove("admin@linkedin.com");
        System.out.println("Removed Linkedin Mail");

        for (String x : uniqueEmail) {
            System.out.println("For loop Showing : " + x);
        }

        uniqueEmail.removeAll(blackList);
        System.out.println("Removed Blacklisted Mail");
        for (String x : uniqueEmail) {
            System.out.println("For loop Showing : " + x);
        }

        System.out.println(uniqueEmail.contains("contact@codingclub.tech"));
    }
}
