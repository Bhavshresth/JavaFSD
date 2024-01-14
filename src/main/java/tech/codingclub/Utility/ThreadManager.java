package tech.codingclub.Utility;

import tech.codingclub.RunnableExample;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// To show the Example of the TaskManager
public class ThreadManager {


    public static void main(String[] args) {

        System.out.println("This side is Bhavshresth ");
        System.out.println("Running Task Manager Which manages all the thread Created Example at"+ new Date().getTime());



        TaskManager taskManager=new TaskManager((100));
        for(int i=0;i<10000;i++){
            RunnableExample temp=new RunnableExample("THREAD_NO -"+i, 0, 500+i);
            taskManager.waitTillQueueIsFreeAndAddTask(temp);
            System.out.println("$$$$$$$$$$$$$$$$$$$$"+i);
        }
        System.out.println("#################################");
    }
}
//Queue is heavy now pause with the loop


//TaskManager for n number of threads parallely !
//        I want main thread to pause when there is enough queue size !



