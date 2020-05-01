package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TopicPage {

    SelenideElement answer = $(By.xpath("//*[@class='col-sm-4 hidden-xs']/button"));
    SelenideElement textBox = $(By.id("editor-textarea"));
    SelenideElement buttonSendResponse = $(By.xpath("//*[@id='posting-mount']//*[text()='Отправить ответ']"));
    SelenideElement buttonGoToMainPage = $(By.xpath("//*[@role='navigation']//*[contains(text(), 'Темы')]"));


       public void buttonAnswerClick() {
           answer.should(Condition.visible).click();
       }

       public void inputTextBox(){
           textBox.val("Разлито сакэ\n" +
                    "Самурай понурился\n" +
                    "Испорчен вечер");
       }

       public void sendResponse() throws InterruptedException {
           Thread.sleep(2000);
           buttonSendResponse.should(Condition.visible).click();
       }

       public void checkMessageIsDisplayed(){
           $(By.xpath("//*[@class='panel-body']//*[text()='haiku' and 'Разлито сакэ' " +
                   "and 'Самурай понурился' and 'Испорчен вечер']"))
                   .should(Condition.visible);
       }

       public void goToMainPage() throws InterruptedException {
           Thread.sleep(2000);
           buttonGoToMainPage.should(Condition.visible).click();
       }


}
