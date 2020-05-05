package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import page.annotations.Element;
import page.annotations.Page;

import static Setting.testSetting.*;
import static com.codeborne.selenide.Selenide.$;


@Page(title = "Страница топика", url = "")
public class TopicPage extends AbstractPage{

    @Element("Ответить")
       public SelenideElement buttonAnswerClick() {
          return  $(By.xpath("//*[@class='col-sm-4 hidden-xs']/button"));
       }

    @Element("Текст")
       public SelenideElement inputTextBox(){
           return $(By.id("editor-textarea"));
       }

    @Element("Отправить ответ")
       public SelenideElement sendResponse() {
           return $(By.xpath("//*[@id='posting-mount']//*[text()='Отправить ответ']"));
       }
    @Element("Ответ")
       public SelenideElement checkMessageIsDisplayed(){
           return $(By.xpath("//*[@class='panel-body']//*[text()='" + USER_LOGIN + "' and '" + TEXT_MASSAGE + "']"));
       }
    @Element("Темы")
       public SelenideElement goToMainPage() {
           return $(By.xpath("//*[@role='navigation']//*[contains(text(), 'Темы')]"));
       }

}
