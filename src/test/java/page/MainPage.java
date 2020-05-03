package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import page.annotations.Page;

import static com.codeborne.selenide.Selenide.*;
import page.annotations.Element;


@Page(title = "Главная страница" , url = "https://dev.n7lanit.ru")
public class MainPage extends AbstractPage {

    @Element("Войти")
    public SelenideElement NavigationBarSignIn() {
       return  $(By.xpath("//*[@type='button' and text() = 'Войти']")).should(Condition.visible);
    }

    @Element("Иконка")
    public SelenideElement checkVisibilityIcons(){
        return $(By.xpath("//*[@id='user-menu-mount']//img[@class='user-avatar']"));
    }

    @Element("Случайный топик")
    public SelenideElement openRandomTopic(){
        ElementsCollection collection=  $$(By.xpath(
                "//span[@class='thread-detail-replies' and not(preceding-sibling::span)]/ancestor::div[3]/a"));
        return collection.get((int) (collection.size()*Math.random()));
    }

}
