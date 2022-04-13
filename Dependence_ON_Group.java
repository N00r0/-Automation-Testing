package Dependency_Tesing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import org.junit.Assert;
public class Dependence_ON_Group {
    WebDriver driver;

    @Test (groups = "initialize")
    public void SetUp ()
    {
        driver = new ChromeDriver ();
        driver.manage().window().maximize();
        System.out.println("1. Set Up Chrome");
    }

    @Test (dependsOnGroups = "initialize", groups = "env_application")
    public void OpenOrangeHRM ()
    {
        driver.get("https://opensource-demo.orangehrmlive1234.com/");
        Assert.assertEquals("Could Not Open OrangeHRM",
                false, true);
        System.out.println("2. Open OrangeHRM");
    }

    @Test  (dependsOnGroups = "env_application")
    public void SignIn ()
    {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        System.out.println("3. Sign In");
    }

    @Test  (dependsOnGroups = "env_application")
    public void SearchUser ()
    {
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.id("searchSystemUser_userName"))
                .sendKeys("Admin");
        driver.findElement(By.id("searchBtn")).click();

        System.out.println("4. Search For User");
    }

    @Test // (dependsOnGroups = "env_application")
    public void SearchEmployee ()
    {
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();

        driver.findElement(By.id("searchBtn")).click();

        System.out.println("5. Search For Employee");
    }

    @Test  (dependsOnGroups = "env_application")
    public void SearchCandidate ()
    {
        driver.findElement(
                By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b")).click();
        driver.findElement(By.id("btnSrch")).click();

        System.out.println("6. Search For Candidate");
    }

    @Test  (dependsOnGroups = "env_application")
    public void SignOut ()
    {
        driver.findElement(By.id("welcome")).click();

        driver.findElement(By.xpath(
                 "//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]")).click();
        System.out.println("7. Sign Out");
    }
}
