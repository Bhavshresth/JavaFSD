package tech.codingclub;

import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("Stack class running at " + new Date().toString() + " Sharp.");

        Stack<String> stack = new Stack<String>();
        Stack<Integer> s = new Stack<Integer>();


        s.push(2);
        s.push(5);
        s.push(10);
        s.push(101);


        int topElementPoped = s.pop();

        System.out.println("Top element : " + s.peek());

        int index = s.search(5);
        int find200 = s.search(200);

        System.out.println("Index of 5" + index);
        System.out.println("Index of 200" + find200);

        Iterator<Integer> iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator showing elements : " + iterator.next());

        }

        while (!s.empty()) {
            int topElement = s.pop();
            System.out.println("Popped :" + topElement);
        }


    }
}
