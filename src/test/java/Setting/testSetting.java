package Setting;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSetting {

    public static final String USER_LOGIN = "haiku";
    public static final String USER_password = "123123Qq";
    public static final String TEXT_MASSAGE = "новый текст сообщения";


    public static void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
        Configuration.timeout = 6000;
    }

    public static void close(){
        WebDriverRunner.closeWebDriver();
    }
}
