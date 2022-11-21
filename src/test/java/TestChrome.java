import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestChrome {

    ChromeDriver driver = new ChromeDriver();

    @AfterMethod

    public  void tearDown(){
        driver.close();
        driver.quit();
    }

    @Test

    public void chromeTest() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.lv/?hl=en");

     //   driver.findElement(By.xpath("<div class=\"QS5gu sy4vM\" role=\"none\">Accept all</div>"));

        WebElement acceptButton = driver.findElement(By.xpath("//button//div[contains(text(), 'Accept all')]"));
        acceptButton.click();

        WebElement searchfield = driver.findElement(By.name("q"));
        searchfield.sendKeys("acodemy");

        searchfield.sendKeys(Keys.ENTER);

        Assert.assertEquals(driver.getTitle (), "acodemy - Google Search");

        System.out.println();

    }
}
