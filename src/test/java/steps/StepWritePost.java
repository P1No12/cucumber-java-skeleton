package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MainPage;
import page.TopicPage;

import java.util.List;

public class StepWritePost {
    MainPage main = new MainPage();
    TopicPage topicPage = new TopicPage();


    @Then("Open random topic")
    public void openRandomTopic() { main.openRandomTopic().click(); }

    @Then("Click answer")
    public void clickAnswer() {
        topicPage.buttonAnswerClick().click();
    }

    @Then("Write text in text box {word}")
    public void writeTextInTextBoxTEST(String test)  {
        topicPage.inputTextBox().val(test); }

    @Then("Send a response")
    public void sendAResponse() throws InterruptedException {
        topicPage.sendResponse().click();
    }

    @Then("Check that your message is displayed {word}")
    public void checkThatYourMessageIsDisplayedTEST(String text) {
        topicPage.checkMessageIsDisplayed(text);
    }

    @Then("Go to the main page")
    public void goToTheMainPage() throws InterruptedException { topicPage.goToMainPage().click(); }

    @Then("Repeat steps {word}")
    public void repeatStepsTEST(String text) throws InterruptedException {
        openRandomTopic();
        clickAnswer();
        writeTextInTextBoxTEST(text);
        sendAResponse();
        checkThatYourMessageIsDisplayedTEST(text);
        goToTheMainPage();
    }


}
