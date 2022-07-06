package threadpractice;

import java.util.ArrayList;

/**
 * d. PrimeNumber class will implement prime number:
 * 1. is a number prime number?
 * 2. given a number find all the prime number inclusive this number
 * 3. given a number find that many prime numbers.
 */
public class PrimeNumber
{

    /**
     *
     * @param number
     * @return
     */
    public static boolean isPrime(int number)
    {
        if (number < 2)
        {
            return false;
        }
        else
        {
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPrimeRecursive(int number, int i)
    {
        if (number <= 2)
        {
            return (number == 2) ? true : false;
        }

        if (number % i == 0)
        {
            return false;
        }

        if (i * i > number)
        {
            return true;
        }

        return isPrimeRecursive(number, i + 1);
    }

    /**
     * Returns a list of prime number including num
     *
     * @param num
     * @return
     */
    public static ArrayList<Integer> primeList(int num)
    {
        ArrayList<Integer> prime = new ArrayList<>();

        for (int i = 2; i <= num; i++)
        {
            if (isPrime(i))
            {
                prime.add(i);
            }
        }

        return prime;
    }

    public static ArrayList<Integer> primeNumbersList(int num)
    {
        ArrayList<Integer> primes = new ArrayList();
        if (num < 1)
        {
            return null;
        }

        int firstPrime = 2;
        int i = 0;
        while (i < num)
        {
            if (isPrime(firstPrime))
            {
                primes.add(firstPrime);
                i++;
            }
            ++firstPrime;
        }

        return primes;
    }

}
