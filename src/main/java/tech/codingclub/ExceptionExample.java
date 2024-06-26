package tech.codingclub;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int x = 10;
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        try {
            int ans = x / y;
            System.out.println("Answer=" + ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int arr[] = {1, 2, 3, 5, 6};
            System.out.println(arr[100]);
        } catch (ArithmeticException e) {
            System.out.println("catch!!  ArithmeticException  ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch!! ArrayIndexOutOfBoundsException ");
        } finally {
            System.out.println("INSIDE FINALLY");
        }
        System.out.println("HELLO WORLD");
    }
}
