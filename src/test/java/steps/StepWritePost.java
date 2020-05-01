package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MainPage;
import page.TopicPage;

public class StepWritePost {
    MainPage main = new MainPage();
    TopicPage topicPage = new TopicPage();

    @Then("Open random topic")
    public void openRandomTopic() { main.openRandomTopic(); }

    @Then("Click answer")
    public void clickAnswer() {
        topicPage.buttonAnswerClick();
    }

    @Then("Write text in text box")
    public void writeTextInTextBox(){ topicPage.inputTextBox(); }

    @Then("Send a response")
    public void sendAResponse() throws InterruptedException {
        topicPage.sendResponse();
    }

    @Then("Check that your message is displayed")
    public void checkThatYourMessageIsDisplayed() {
        topicPage.checkMessageIsDisplayed();
    }

    @Then("Go to the main page")
    public void goToTheMainPage() throws InterruptedException { topicPage.goToMainPage(); }

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
