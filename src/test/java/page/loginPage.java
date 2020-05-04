package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import page.annotations.Element;
import page.annotations.Page;

import static com.codeborne.selenide.Selenide.$;


@Page(title = "Страница логина", url = " ")
public class loginPage extends AbstractPage {

    @Element("Логин")
    public SelenideElement inputLogin(){
        return $(By.id("id_username"));
    }

    @Element("Пароль")
    public SelenideElement inputPassword(){
        return $(By.id("id_password"));
    }

    @Element("Кнопка войти")
    public SelenideElement buttonSignIn(){
        return $(By.xpath("//*[@class='modal-footer']/button")).should(Condition.visible);
    }

}
