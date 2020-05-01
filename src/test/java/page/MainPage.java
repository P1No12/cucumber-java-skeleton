package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static Setting.testSetting.USER_LOGIN;
import static Setting.testSetting.USER_password;


public class MainPage  {

    public SelenideElement openRandomTopic(){
        ElementsCollection collection=  $$(By.xpath(
                "//span[@class='thread-detail-replies' and not(preceding-sibling::span)]/ancestor::div[3]/a"));
        return collection.get((int) (collection.size()*Math.random())).should(Condition.visible);
    }

    public SelenideElement NavigationBarSignIn() {
       return  $(By.xpath("//*[@type='button' and text() = 'Войти']")).should(Condition.visible);
    }

    public SelenideElement inputLogin(){
        return $(By.id("id_username"));
    }

    public SelenideElement inputPassword(){
        return $(By.id("id_password"));
     }


     public SelenideElement buttonSignIn(){
        return $(By.xpath("//*[@class='modal-footer']/button")).should(Condition.visible);
     }

    public void checkVisibilityIcons(){
        $(By.xpath("//*[@id='user-menu-mount']//img[@class='user-avatar']")).should(Condition.image);
    }

}
