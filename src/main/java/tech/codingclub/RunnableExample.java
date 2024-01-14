package tech.codingclub;

import java.util.Date;
import java.util.Scanner;

public class RunnableExample implements Runnable {

    private String threadName;
    public int counter;
    private int waitTimeWhileLoop;

    public RunnableExample(String threadName, int counter, int waitTimeWhileLoop){
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
        System.out.println("Running Runnable Thread Example at"+ new Date().getTime());



        RunnableExample runnable1=new RunnableExample("THREAD A",0,500);//0
        RunnableExample runnable2=new RunnableExample("THREAD B",500,500);//500
        RunnableExample runnable3=new RunnableExample("THREAD C",500,500);//500

        Thread thread1=new Thread(runnable1);
        Thread thread2=new Thread(runnable2);
        Thread thread3=new Thread(runnable3);
        thread1.start();
        thread2.start();
        thread3.start();


        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();






    }
}
