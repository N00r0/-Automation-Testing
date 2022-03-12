package TAU;
import org.testng.annotations.*;
public class TestNG {
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforeSuite : Chrome - Set Up System Property");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest : Open Chrome");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("beforeClass : Open Test Application");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("beforeMethod : Sign In");
    }

    @Test (priority = 2)
    public void searchCustomer()
    {

        System.out.println("searchCustomer : Search For Customer");
    }

    @Test (priority = 1)
    public void searchProduct()
    {

        System.out.println("searchProduct : Search For Product");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("afterMethod : Sign Out");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("afterClass : Close Test Application");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("afterTest : Close Chrome");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite : Chrome - Clean Up All Cookies");
    }
}
