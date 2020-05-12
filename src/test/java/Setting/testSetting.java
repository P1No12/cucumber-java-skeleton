package Setting;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
//import io.github.bonigarcia.wdm.ChromeDriverManager;

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
       // Configuration.startMaximized= true;
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] screenshot()/* throws IOException */ {
        try {
            File screen = ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.FILE);
            return Files.toByteArray(screen);
        } catch (IOException e) {
            return null;
        }
    }
    public static void close(){
        WebDriverRunner.closeWebDriver();
    }
}
