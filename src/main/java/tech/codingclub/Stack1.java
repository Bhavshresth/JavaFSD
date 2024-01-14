package tech.codingclub;

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> s = new Stack<Character>();
            boolean balanced = true;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (ch == '{' || ch == '[' || ch == '(') {
                    s.push(ch);
                } else {
                    if (s.size() == 0) {
                        balanced = false;
                        break;
                    } else if (ch == ')' && s.peek() == '(' || ch == '}' && s.peek() == '{' || ch == ']' && s.peek() == '[') {
                        s.pop();

                    } else {
                        balanced = false;
                        break;
                    }
                }
            }
            System.out.println(balanced);
        }
    }
}
//Hackerrank Question JAVASTACK