package tech.codingclub;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//     Input of the elements
        int n = sc.nextInt();
//      int x[]=new int[10];
        ArrayList<Integer> rows[] = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                int element = sc.nextInt();

                list.add(element);
            }
            rows[i] = list;
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            if (x < n && x >= 0 && y >= 0 && y < rows[x].size()) {
                System.out.println(rows[x].get(y));
            }
        }
    }
}
//Hackerrank Question ARRAYLIST1