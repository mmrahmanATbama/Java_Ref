/*
 * Calculate prime number.
 * use  a thread to calculate prime number
 *
 * main will ask what do you want to implement:
 * a. thread class directly.
 * b. Class extending thread class.
 * c. Class implementing Runnable interface
 *
 * d. PrimeNumber class will implement prime number.
 * 1. is a number prime number?
 * 2. given a number find all the prime number inclusive this number
 * 3. given a number find that many prime numbers.
 * 4. given two number and a choice, find that many prime numbers, larger and smaller.
 * 5. this will have two methods, one will use recursion, another will use regular method
 *
 *
 *
 */
package threadpractice;

import GetUserInput.GetUserInput;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mmrha
 */
public class ThreadPractice
{

    PrimeNumber primeNumber;
    static ArrayList<Integer> primeNumberList = new ArrayList<>();

    public static void printNumbers(ArrayList<Integer> number)
    {
        for (int num : number)
        {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        final long startTime = System.currentTimeMillis();
        // **********************************************************
        GetUserInput getUserInput = new GetUserInput();
        String data = null;
        try
        {
            data = getUserInput.getUserInput();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

//        GetUserInput.scanUserInput();
        //GetUserInput.consoleUserInput();
        // System.out.println("user entered a prime number?  " + PrimeNumber.isPrime(parseInt(data)));
        //System.out.println("user entered a prime number?  " + PrimeNumber.isPrimeRecursive(parseInt(data), 2));
//        primeNumberList = PrimeNumber.primeList(parseInt(data));
//        System.out.println("Prime numbers upto " + data + " are following: ");
//        printNumbers(primeNumberList);
//        primeNumberList.clear();
//        System.out.println("Consecutive " + data + " Prime numbers: ");
//        primeNumberList = PrimeNumber.primeNumbersList(parseInt(data));
//        printNumbers(primeNumberList);
        // Thread thread = new Thread(); then thread.start() => this does not know what code to run, following anonymous class handles that
        // also we can create another subclass of thread and ask it to run code. 
        // Note: not doing it this way, we get : local variable referenced from an inner class must be final or effectively final error
        final int value = parseInt(data);
        new Thread()
        {

            @Override
            public void run()
            {
                System.out.println("user entered a prime number?  " + PrimeNumber.isPrime(value));
            }
        }.start();

        Thread listThread = new PrimeThread(data);
        try
        {
            listThread.join();
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(ThreadPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
        listThread.start();

//*********************************
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));

    }

}
