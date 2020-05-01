package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import page.MainPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class loginStepDefs {
    MainPage main = new MainPage();

    @Then("Site open")
    public void siteOpen() {
        open("https://dev.n7lanit.ru");
    }

    @Then("click navigation bar button sign in")
    public void clickNavigationBarButtonSignIn() {
        main.NavigationBarSignIn();
    }

    @Then("Input Login")
    public void inputLogin() {
    main.inputLogin();
    }

    @Then("Input Passport")
    public void inputPassport() {
        main.inputPassword();
    }

    @Then("Click sign in")
    public void clickSignIn() {
        main.buttonSignIn();
    }

    @Then("Check visibility icons")
    public void checkVisibilityIcons() {
        main.checkVisibilityIcons();
    }


}
