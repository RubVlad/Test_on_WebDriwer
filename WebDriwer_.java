import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class WebDriwer_ {

   /* public static void main(String[] args) {

    }*/



    @Test
    public void SeleniumTest()
    {
        WebDriver driver = new ChromeDriver();

        String Exp_Name="Vasya";


        driver.get("http://www.i.ua/");
        driver.findElement(By.CssSelector("[name=\"login\"]")).sendKeys("Vasyaaaa");
        driver.findElement(By.CssSelector("[name=\"pass\"]")).sendKeys("VasyaPass123");
        driver.findElement(By.CssSelector("[tabindex=\"5\"]")).Click();

        String ResponseName=driver.findElement(By.CssSelector(".user_name")).innerText;

        assertEquals(Exp_Name,ResponseName);
        driver.quit();
    }
}