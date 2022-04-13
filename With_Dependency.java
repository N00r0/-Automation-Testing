package Dependency_Tesing;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import org.junit.Assert;
public class With_Dependency {
    WebDriver driver;

    @Test
    public void SetUp ()
    {
        driver = new ChromeDriver ();
        driver.manage().window().maximize();
        System.out.println("1. Set Up Chrome");
    }

    @Test (dependsOnMethods = "SetUp")
    public void OpenOrangeHRM ()
    {
        driver.get("https://opensource-demo.orangehrmlive1234.com/");
        Assert.assertEquals("Could Not Open OrangeHRM",
                false, true);
        System.out.println("2. Open OrangeHRM");
    }

    @Test (dependsOnMethods = "OpenOrangeHRM")
    public void SignIn ()
    {
        WebElement textUsername = driver.findElement(By.id("txtUsername"));
        textUsername.sendKeys("Admin");

        WebElement textPassword = driver.findElement(By.id("txtPassword"));
        textPassword.sendKeys("admin123");

        WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
        buttonLogin.click();

        System.out.println("3. Sign In");
    }

    @Test (dependsOnMethods = "SignIn")
    public void SearchUser ()
    {
        WebElement menuAdmin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        menuAdmin.click();
        WebElement textUserName = driver.findElement(By.id("searchSystemUser_userName"));
        textUserName.sendKeys("Admin");
        WebElement buttonSearch = driver.findElement(By.id("searchBtn"));
        buttonSearch.click();
        System.out.println("4. Search For User");
    }

    @Test (dependsOnMethods = { "OpenOrangeHRM", "SignIn" } )
    public void SearchEmployee ()
    {
        WebElement menuPIM = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
        menuPIM.click();
        WebElement buttonSearch = driver.findElement(By.id("searchBtn"));
        buttonSearch.click();
        System.out.println("5. Search For Employee");
    }

    @Test  (dependsOnMethods = { "OpenOrangeHRM", "SignIn" } )
    public void SignOut ()
    {
        WebElement linkWelcome = driver.findElement(By.id("welcome"));
        linkWelcome.click();
        WebElement linkLogout = driver.findElement(By.xpath("//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]"));
        linkLogout.click();
        System.out.println("7. Sign Out");
    }
}
