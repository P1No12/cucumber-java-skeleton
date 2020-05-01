package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static Setting.testSetting.USER_LOGIN;
import static Setting.testSetting.USER_password;


public class MainPage  {


    private SelenideElement loginInput = $(By.id("id_username"));
    private SelenideElement passwordInput = $(By.id("id_password"));
    private ElementsCollection collection=  $$(By.xpath(
            "//span[@class='thread-detail-replies' and not(preceding-sibling::span)]/ancestor::div[3]/a"));

    public void openRandomTopic(){
        collection.get((int) (collection.size()*Math.random())).should(Condition.visible).click();
    }

    public void NavigationBarSignIn() {
        $(By.xpath("//*[@type='button' and text() = 'Войти']")).should(Condition.visible).click();
    }

    public void inputLogin(){
         loginInput.val(USER_LOGIN);
    }

    public void inputPassword(){
         passwordInput.val(USER_password);
     }


     public void buttonSignIn(){
        $(By.xpath("//*[@class='modal-footer']/button")).should(Condition.visible).click();
     }

    public void checkVisibilityIcons(){
        $(By.xpath("//*[@id='user-menu-mount']//img[@class='user-avatar']")).should(Condition.image);
    }

}
