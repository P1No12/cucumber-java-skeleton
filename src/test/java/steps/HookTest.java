package steps;

import com.codeborne.selenide.WebDriverRunner;
import com.google.common.io.Files;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import io.qameta.allure.Attachment;
import javafx.application.Application;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import static Setting.testSetting.*;
import static gherkin.Parser.RuleType.Scenario;

public class HookTest {

    @Before
    public void before() {
      start();
    }
    @AfterStep
    @Attachment(type = "image/png")
    public static byte[] screenshot1()/* throws IOException */ {
        try {
            File screen = ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.FILE);
            return Files.toByteArray(screen);
        } catch (IOException e) {
            return null;
        }
    }
    @After
    public void after(cucumber.api.Scenario scenario) {

        screenshot();

        close();


    }
}
