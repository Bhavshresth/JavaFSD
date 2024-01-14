package tech.codingclub;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s;
        Set<String> s1 = new HashSet<String>();

        sc.nextLine();
        for (int i = 0; i < t; i++) {
            s = sc.nextLine();

            s1.add(s);
            System.out.println(s1.size());
        }
    }
}
//Hackerrank Question HashSet