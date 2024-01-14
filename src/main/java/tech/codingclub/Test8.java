package tech.codingclub;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Test8 {
    public static void main(String[] args) {
        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("Test8 running at " + new Date().toString() + " Sharp.");

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("This");
        ll.add("is");
        ll.add("how");
        ll.add("you");
        ll.add("code");
        ll.add("LinkedList");

        String first = ll.getFirst();
        String last = ll.getLast();

        System.out.println(first + " " + last);
        System.out.println("Size of the LinkList :" + ll.size());

        Iterator<String> i = ll.iterator();
        while (i.hasNext()) {

            String data = i.next();
            System.out.println(data);
        }
    }
}
