package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MainPage;
import page.TopicPage;

public class StepWritePost {
    MainPage main = new MainPage();
    TopicPage topicPage = new TopicPage();

    @Then("Open random topic")
    public void openRandomTopic() { main.openRandomTopic().click(); }

    @Then("Click answer")
    public void clickAnswer() {
        topicPage.buttonAnswerClick().click();
    }

    @Then("Write text in text box {string}")
    public void writeTextInTextBox(String arg0) { topicPage.inputTextBox().val(arg0); }

    @Then("Send a response")
    public void sendAResponse() throws InterruptedException {
        topicPage.sendResponse().click();
    }

    @Then("Check that your message is displayed {string}")
    public void checkThatYourMessageIsDisplayed(String arg0) {
        topicPage.checkMessageIsDisplayed(arg0);
    }

    @Then("Go to the main page")
    public void goToTheMainPage() throws InterruptedException { topicPage.goToMainPage().click(); }

    @Then("Repeat steps  {string}")
    public void repeatSteps(String arg0) throws InterruptedException {
        openRandomTopic();
        clickAnswer();
        writeTextInTextBox(arg0);
        sendAResponse();
        checkThatYourMessageIsDisplayed(arg0);
        goToTheMainPage();
    }


}
