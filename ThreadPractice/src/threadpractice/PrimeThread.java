package threadpractice;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;

/**
 *
 */
public class PrimeThread extends Thread
{

    int data;

    public PrimeThread(String data)
    {
        this.data = parseInt(data);
    }

    @Override
    public void run()
    {
        ArrayList<Integer> list = new ArrayList();
        list = PrimeNumber.primeList(data);
        for (int i : list)
        {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}
