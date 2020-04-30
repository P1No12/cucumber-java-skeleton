package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.skeleton.testSetting;
import org.junit.Before;
import page.BasePage;
import page.MainPage;

import io.cucumber.skeleton.testSetting;

import static com.codeborne.selenide.Selenide.open;


public class MyStepdefs extends BasePage {


   // testSetting

    @Given("open browser and open url")
    public void openBrowserAndOpenUrl() throws InterruptedException {
        main.goTo();
        Thread.sleep(10000);

    }

}
