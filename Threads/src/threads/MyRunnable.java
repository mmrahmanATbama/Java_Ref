
package threads;

/**
 *
 * @author mmrha
 */
public class MyRunnable implements Runnable
{

    @Override
    public void run()
    {
        System.out.println(ThreadColor.ANSI_GREEN + "Hello from myRunnable? " + Thread.currentThread().getName());
    }

}
