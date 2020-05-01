package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TopicPage {

       public SelenideElement buttonAnswerClick() {
          return  $(By.xpath("//*[@class='col-sm-4 hidden-xs']/button")).should(Condition.visible);
       }

       public SelenideElement inputTextBox(){
           return $(By.id("editor-textarea"));
       }

       public SelenideElement sendResponse() throws InterruptedException {
           Thread.sleep(2000);
           return $(By.xpath("//*[@id='posting-mount']//*[text()='Отправить ответ']")).should(Condition.visible);
       }

       public void checkMessageIsDisplayed(){
           $(By.xpath("//*[@class='panel-body']//*[text()='haiku' and 'Разлито сакэ' " +
                   "and 'Самурай понурился' and 'Испорчен вечер']"))
                   .should(Condition.visible);
       }

       public SelenideElement goToMainPage() throws InterruptedException {
           Thread.sleep(2000);
           return $(By.xpath("//*[@role='navigation']//*[contains(text(), 'Темы')]")).should(Condition.visible);
       }


}
