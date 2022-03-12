package TAU;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class TestNG_Assert {
    SoftAssert softassert = new SoftAssert();

    /* For test soft assert replace Assert. to softassert.
    and uncomment softassert.assertAll();
    NOTES
    1 RUN THE CLASS NOT THE FUNCTION ONLY
    2 WHEN YOU TEST SOFT ASSERT RUN ONCE WITH softassert.assertAll();
    AND ONCE WITHOUT IT

     */
    @Test
    public void testHomePageVerification ()
    {
        Assert.assertEquals(false, true, "The Welcome Link Is Not Correct On The Home Page");
        System.out.println("3. Verify Welcome Link");

        Assert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");
        System.out.println("4. Verify Admin Tab");

        Assert.assertTrue(true, "The Dashboard Is Not Correct On The Home Page");
        System.out.println("5. Verify Dashboard");

       // softassert.assertAll();
    }
    @Test
    public void testHomePage ()
    {


        Assert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");
        System.out.println("6. Verify Admin Tab_testHomePage");

        Assert.assertTrue(true, "The Dashboard Is Not Correct On The Home Page");
        System.out.println("7. Verify Dashboard_testHomePage");

    }


}
