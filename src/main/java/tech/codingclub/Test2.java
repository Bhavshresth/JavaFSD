package tech.codingclub;

import java.util.Date;

public class Test2 {

    //parent class
    public static void main(String[] args) {
        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("Test2 running at " + new Date().toString() + " Sharp.");

        int a = 400;
        int b = 8;

        int c = a + b;

        System.out.println("Sum of " + a + " + " + b + " = " + c);

        double wideningVariable = a;
        System.out.println("Widening Variable Value " + " = " + wideningVariable);

        wideningVariable = a + 0.1;
        System.out.println("Modified Widening Variable Value " + " = " + wideningVariable);

        int narrowingVariable = (int) wideningVariable;
        System.out.println("Narrowing Variable Value " + " = " + narrowingVariable);

        int overflowVariable = Integer.MAX_VALUE;
        System.out.println("Max Value of Integer " + " = " + overflowVariable);

        System.out.println("OverflowVariable Value" + " = " + overflowVariable);

        overflowVariable += 4;
        System.out.println("Modified OverflowVariable Value" + " = " + overflowVariable);

    }
}

