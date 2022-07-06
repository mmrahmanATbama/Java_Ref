package GetUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * This class will get user inputs:
 *
 */
public class GetUserInput
{

    String name;

    public String getUserInput() throws IOException
    {
        String name1;
// Ask user to enter data
        System.out.print("Enter data: ");
// Enter data
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// read data
        name1 = reader.readLine();
// Print
        System.out.println("Name is: " + name1);
        return name1;
    }

    public static void scanUserInput()
    {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        name = scanner.nextLine();

        System.out.println("Name is: " + name);

    }

    public static void consoleUserInput()
    {
        String name1;
        System.out.println("Enter data: ");
        name1 = System.console().readLine();
        System.out.println("Name is: " + name1);
    }

}
