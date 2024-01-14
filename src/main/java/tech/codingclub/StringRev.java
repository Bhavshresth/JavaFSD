package tech.codingclub;

import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        int l = s.length();
        for (int i = l - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            s1 = s1 + ch;
        }
        System.out.println("Reversed String=" + s1);

    }
}
