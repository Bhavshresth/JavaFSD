package tech.codingclub;

import java.util.Date;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("Test6 running at " + new Date().toString() + " Sharp.");

        Random random = new Random();
        int randomIntValue = random.nextInt(100);

        System.out.println("randomIntValue : 0 to 99 :" + randomIntValue);

        int randomValueInRange = 50 + random.nextInt(50);
        System.out.println("randomIntValue  50-90 :" + randomValueInRange);

        String str = "HelloWorld";
        System.out.println("Printing String : " + str);
        str = str + "!";
        System.out.println("Printing Modified String : " + str);

        System.out.println("Current Length : " + str.length());
        System.out.println("String (5,end) : " + str.substring((5)));
        System.out.println("String (5,7) : " + str.substring(5, 7));

        System.out.println("UC : " + str.toUpperCase());
        System.out.println("LC : " + str.toLowerCase());

        int data = str.indexOf('e');
        System.out.println("Index of e :" + data);

        char g = str.charAt(5);
        System.out.println("Char at 5 : " + g);

        String s1 = "abc";
        String s2 = "dbc";
        System.out.println(s1.compareTo(s2));

        Date date = new Date();
        long previousEpochTime = date.getTime();

        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        long timeNow = new Date().getTime();
        long diff = (timeNow - previousEpochTime);

        System.out.println(diff + " milliseconds to ru 10^6 on my machine.");

        Date datefromEpoch = new Date(1703421906479L);
        System.out.println(datefromEpoch.toString());


        System.out.println("current time : " + new Date().toString());


    }
}
