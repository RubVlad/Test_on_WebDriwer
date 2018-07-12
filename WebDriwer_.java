//import org.junit.jupiter.api.Test;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.Assert.assertEquals;


public class WebDriwer_ {

   /* public static void main(String[] args) {

    }*/
   private static WebDriver driver;


    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.get("http://www.i.ua/");
    }



    @Test
    public void SeleniumTest()
    {
        String Exp_Name="Vasya";

        driver.findElement(By.cssSelector("[name=\"login\"]")).sendKeys("Vasyaaaa");
        driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys("VasyaPass123");
        driver.findElement(By.cssSelector("[tabindex=\"5\"]")).click();

        String ResponseName=driver.findElement(By.cssSelector(".user_name")).getText();

        //assertEquals(Exp_Name,ResponseName);
        Assert.assertEquals(Exp_Name,ResponseName);

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
