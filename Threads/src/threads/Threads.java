/*
Note: this is the main class. this calls the subclasses.
        ThreadColor consists of staic variables. 
        Another Thread extends Thread.
        MyRunnable implements Runnable interface. 

Thread is implicitly done when executed, 
Whats difference between Thread class and Runnable. Why do we choose Runnable ?
 */
package threads;

import static java.lang.Thread.currentThread;

/**
 *
 * @author mmrha
 */
public class Threads
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*
        Createing thread: 
            subclass
            instance of Thread
            anonymous class for running thread only one time.
         */
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from the main thread: " + currentThread().getName());
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread == ");
        // always call start and not run.
        anotherThread.start(); // using .run will here will print "Hello from main."  Callin start will print  "Hello from anohter thread"

        // anonymous class
        new Thread()
        {
            public void run()
            {
                System.out.println(ThreadColor.ANSI_RED + "Hello from anonymous class implementation of run." + currentThread().getName());
            }
        }.start();

        // Example of running a thread
        // Thread myRunnable1 = new Thread(new MyRunnable());
        // myRunnable1.start();
        // How to implement Runnable using anonymous class
        // most of the time Runnable is used with anonymous class.
        Thread myRunnable = new Thread(new MyRunnable()
        {
            @Override
            public void run()
            {
                // notice this will override and will no longer print: "Hello from my runnable", instead print the following message.
                System.out.println(ThreadColor.ANSI_RED + "Hello from anonymous class: " + currentThread().getName());
                try
                {
                    // this anonymous run method will now wait until anotherThread is completed. 
                    anotherThread.join(1000);
                    System.out.println(ThreadColor.ANSI_RED + "AnotherThread terminated or timed out, so I am running again.");
                }
                catch (InterruptedException e)
                {
                    System.out.println(ThreadColor.ANSI_RED + "I could not wait after all. I was interrupted");
                }
            }
        });
        // use start, else the code will run it from same thread, instead of a new thread. 
        myRunnable.start();

        // interrupt thread to stop executing (or what it was doing, if it was asleep, this will wake it up) ...
        //anotherThread.interrupt();
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from main thread." + currentThread().getName());

    }

}
