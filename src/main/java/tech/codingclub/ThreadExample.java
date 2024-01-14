package tech.codingclub;

import java.util.Date;
import java.util.Scanner;

public class ThreadExample extends Thread {

    private String threadName;
    public int counter;
    private int waitTimeWhileLoop;

    public ThreadExample(String threadName,int counter,int waitTimeWhileLoop){
        this.threadName=threadName;
        this.counter=counter;
        this.waitTimeWhileLoop = waitTimeWhileLoop;
    }
    //We are overriding How run will Work!
    public void run() {
        //We will define what process we want to run parallely!
        while (counter < 1000) {
            counter++;

                try {
                    Thread.sleep(waitTimeWhileLoop);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(threadName + " : " + counter);

        }
    }
    public static void main(String[] args) {

        System.out.println("This side is Bhavshresth ");
        System.out.println("Running Thread Example at"+ new Date().getTime());


        ThreadExample thread1=new ThreadExample("THREAD A",0,500);//0
        ThreadExample thread2=new ThreadExample("THREAD B",500,1000);//500
        ThreadExample thread3=new ThreadExample("THREAD C",500,2000);//500

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(thread1.counter);
        System.out.println(thread2.counter);
        System.out.println(thread3.counter);


        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();






    }
}
