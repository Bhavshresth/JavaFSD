package tech.codingclub;

import java.util.Date;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("Test5 running at " + new Date().toString() + " Sharp.");

        int a = 10;
        int b = 20;

        System.out.println("Addition :" + (a + b));
        System.out.println("Subtraction :" + (a - b));
        System.out.println("Multiplication :" + (a * b));
        System.out.println("Division :" + (a / b));
        System.out.println("Remainder :" + (a % b));

        double c = -20.2;
        System.out.println("Math.abs() :" + Math.abs(c));
        c = Math.abs(c);
        System.out.println("Math.ceil():" + Math.ceil(c));
        System.out.println("Math.floor():" + Math.floor(c));
        System.out.println("Math.min():" + Math.min(10, 20));
        System.out.println("Math.max():" + Math.max((10), (20)));

        System.out.println("Math.random() 0 to 1 :" + Math.random());
        int random = 10 + (int) (Math.random() * 90);
        System.out.println("Math.random() 10 to 100 :" + random);

        System.out.println("Math.PI :" + Math.PI);

        int e = 100;
        System.out.println("Pre Increment :" + ++e);
        System.out.println("Post Increment :" + e++);


        int i = 1;
        int ans = 1;
        while (i <= 5) {
            ans = ans * i;
            i++;
        }
        System.out.println("5! using while loop :" + ans);

    }
}
