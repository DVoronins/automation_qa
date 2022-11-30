package lv.acodemy.step_defination;

import io.cucumber.java.en.Given;
import lv.acodemy.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandStepDefs {
    private final WebDriver driver = DriverManager.getInstance();
    @Given("user opens {string}")
    public void user_opens(String url) {
        driver.get(url);

        }
    }
