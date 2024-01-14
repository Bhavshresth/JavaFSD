package tech.codingclub;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class List1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ll.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String data = sc.nextLine();
            data = sc.nextLine();
//            Important
            if (data.equals("Insert")) {
                ll.add(sc.nextInt(), sc.nextInt());
            } else {
                ll.remove(sc.nextInt());
            }

            Iterator<Integer> iterator = ll.iterator();
            while (iterator.hasNext()) {

                int d = iterator.next();
                System.out.println(d);
            }

        }
    }
}
