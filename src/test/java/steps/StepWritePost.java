package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MainPage;
import page.TopicPage;

import static Setting.testSetting.WRITE_TEXT;

public class StepWritePost {
    MainPage main = new MainPage();
    TopicPage topicPage = new TopicPage();

    @Then("Open random topic")
    public void openRandomTopic() { main.openRandomTopic().click(); }

    @Then("Click answer")
    public void clickAnswer() {
        topicPage.buttonAnswerClick().click();
    }

    @Then("Write text in text box")
    public void writeTextInTextBox() { topicPage.inputTextBox().val(WRITE_TEXT); }

    @Then("Send a response")
    public void sendAResponse() throws InterruptedException {
        topicPage.sendResponse().click();
    }

    @Then("Check that your message is displayed")
    public void checkThatYourMessageIsDisplayed() {
        topicPage.checkMessageIsDisplayed(WRITE_TEXT);
    }

    @Then("Go to the main page")
    public void goToTheMainPage() throws InterruptedException { topicPage.goToMainPage().click(); }

    @Then("Repeat steps")
    public void repeatSteps() throws InterruptedException {
        openRandomTopic();
        clickAnswer();
        writeTextInTextBox();
        sendAResponse();
        checkThatYourMessageIsDisplayed();
        goToTheMainPage();
    }

}
