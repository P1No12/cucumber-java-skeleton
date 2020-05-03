package steps;


import Setting.testSetting;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HookTest {

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

      /*  ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");*/
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
        Configuration.timeout = 6000;
    }

    @After
    public void after() {
        WebDriverRunner.closeWebDriver();
    }
}
