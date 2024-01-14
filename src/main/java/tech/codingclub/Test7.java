package tech.codingclub;

import java.util.ArrayList;
import java.util.Date;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("Test7 running at " + new Date().toString() + " Sharp.");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Welcome");
        arrayList.add("to");
        arrayList.add("the");
        arrayList.add("Java");
        arrayList.add("code");
        arrayList.add("RemoveMe");

        String first = arrayList.get(0);
        System.out.println("First one :" + first);

        arrayList.set(2, "THE");

        int size = arrayList.size();

        arrayList.remove(size - 1);

        for (int i = 0; i < size - 1; i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.clear();
        System.out.println("Size after clearing :" + arrayList.size());
    }
}
