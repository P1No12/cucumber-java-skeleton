package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static Setting.testSetting.USER_LOGIN;
import static com.codeborne.selenide.Selenide.$;

public class TopicPage {

       public SelenideElement buttonAnswerClick() {
          return  $(By.xpath("//*[@class='col-sm-4 hidden-xs']/button")).should(Condition.visible);
       }

       public SelenideElement inputTextBox(){
           return $(By.id("editor-textarea"));
       }

       public SelenideElement sendResponse() throws InterruptedException {
           Thread.sleep(800);
           return $(By.xpath("//*[@id='posting-mount']//*[text()='Отправить ответ']")).should(Condition.visible);
       }

       public void checkMessageIsDisplayed(String arg0){
           $(By.xpath("//*[@class='panel-body']//*[text()='" + USER_LOGIN + "' and '" + arg0 + "']"))
                   .should(Condition.visible);
       }

       public SelenideElement goToMainPage() throws InterruptedException {
           Thread.sleep(800);
           return $(By.xpath("//*[@role='navigation']//*[contains(text(), 'Темы')]")).should(Condition.visible);
       }


}
