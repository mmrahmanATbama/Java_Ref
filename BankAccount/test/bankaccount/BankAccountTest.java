package bankaccount;

import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author mmrha
 */
public class BankAccountTest
{
    
    public BankAccountTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }

    /**
     * Test of deposit method, of class BankAccount.
     */
    @Test
    public void testDeposit()
    {
        System.out.println("deposit");
        double amount = 0.0;
        boolean branch = false;
        BankAccount instance = null;
        double expResult = 0.0;
        double result = instance.deposit(amount, branch);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdraw method, of class BankAccount.
     */
    @Test
    public void testWithdraw()
    {
        System.out.println("withdraw");
        double amount = 0.0;
        boolean branch = false;
        BankAccount instance = null;
        double expResult = 0.0;
        double result = instance.withdraw(amount, branch);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance()
    {
        System.out.println("getBalance");
        BankAccount instance = null;
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class BankAccount.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        BankAccount.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
