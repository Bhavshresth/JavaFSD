package tech.codingclub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class SortExample {

    public static void main(String[] args) {
        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("SortExample class running at " + new Date().toString() + " Sharp.");

        ArrayList<String> emails = new ArrayList<String>();
        emails.add("contact@codingclub.tech");
        emails.add("admin@google.com");
        emails.add("admin@linkedin.com");

        for (String x : emails) {
            System.out.println("For loop Showing : " + x);
        }

//        To sort a Collections set
        Collections.sort(emails);
        System.out.println("####After sort####");
        for (String x : emails) {
            System.out.println("For loop Showing : " + x);
        }

// To Sort an arrays
        int arr[] = {43, 3, 56, 2234, 44};
        Arrays.sort(arr);
        for (int ele : arr) {
            System.out.println("Sorted Array : " + ele);
        }
    }
}
