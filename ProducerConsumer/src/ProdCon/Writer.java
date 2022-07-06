package ProdCon;

import java.util.Random;

public class Writer implements Runnable
{

    private Message message;

    public Writer(Message message)
    {
        this.message = message;
    }

    @Override
    public void run()
    {
        String messages[] =
        {
            "Humpty Dumpty sat on a wall",
            "Humpty Dumpty had a great fall",
            "All the King's horses and all the King's man",
            "Couldn't put Humpty together again"
        };

        Random random = new Random();

        for (int i = 0; i < messages.length; i++)
        {
            message.write(messages[i]);
            try
            {
                Thread.sleep(random.nextInt(2000));
            }
            catch (InterruptedException ex)
            {
            }
        }
        message.write("Finished");

    }
}
