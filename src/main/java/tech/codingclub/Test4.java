package tech.codingclub;

import java.util.Date;
import java.util.Scanner;

public class Test4 {

    //parent class
    public static void main(String[] args) {
        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("Test4 running at " + new Date().toString() + " Sharp.");

        int a[] = {10, 20, 30, 40};
        a[3] = 80;

        System.out.println("Last Value is :" + a[a.length - 1]);

        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Last column last row : " + arr[1][2]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int n = sc.nextInt();
        System.out.println("Enter b : ");
        int m = sc.nextInt();

        System.out.println("Sum of a and b =" + (n + m));
    }
}

