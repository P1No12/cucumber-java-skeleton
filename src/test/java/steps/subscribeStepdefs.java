package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.И;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import page.subscribedPage;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static page.AbstractPage.getPageByTitle;
public class subscribeStepdefs {
    List<String> list = new ArrayList<>();

    @И("на {string} нажать на кнопку подписки {string}")
    public void наНажатьНаКнопкуПодписки(String str, String inactive) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(1000);
        SelenideElement element= getPageByTitle(str).getElementByName(inactive);
        element.click();
        list.add($(By.xpath("//*[@class='list-group-item thread-new']//*[@class='col-sm-2 col-md-2 hidden-xs']//div[@class='col-xs-12 hidden-xs hidden-sm']" +
                "//*[@class='btn-group open']/button/ancestor::div[6]//a[@class='item-title thread-title']")).getAttribute("href")
                .replaceAll("https:\\/\\/dev.n7lanit.ru",""));

    }

    @И("на {string} в выпадающем меню нажать {string}")
    public void наВВыпадающемМенюНажать(String str, String sub) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(2000);
        getPageByTitle(str).getElementByName(sub).should(Condition.visible).click();
    }

    @И("на {string} нажать на кнопку {string}")
    public void наНажатьНаКнопку(String str, String subscribes) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(2000);
        getPageByTitle(str).getElementByName(subscribes).should(Condition.visible).click();
    }

    @И("Проверить – что среди отображающихся подписок есть те, на которые вы подписались ранее в этом сценарии")
    public void проверитьЧтоСредиОтображающихсяПодписокЕстьТеНаКоторыеВыПодписалисьРанееВЭтомСценарии()  throws InterruptedException {
        Thread.sleep(2000);
        for(String s: list){
            $(By.xpath("//*[@href='"+ s +"']")).should(Condition.visible);
        }
    }

    @И("на {string} {string} от всех подписок на которые вы подписались ранее в этом сценарии")
    public void наОтВсехПодписокНаКоторыеВыПодписалисьРанееВЭтомСценарии(String str, String unsubscribe) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(2000);

        for(String s: list){
            $(By.xpath("//*[@href='"+ s +"']/ancestor::div[4]//*[@class='col-sm-2 col-md-2 hidden-xs']//*[@class='col-xs-12 hidden-xs hidden-sm']" +
                    "//button[@type='button']")).click();
            getPageByTitle(str).getElementByName(unsubscribe).click();
        }
        //*[@href='/t/newtopic/936/']/ancestor::div[4]//*[@class='col-sm-2 col-md-2 hidden-xs']//*[@class='col-xs-12 hidden-xs hidden-sm']//button[@type='button']
//*[@href='/t/newtopic/936/']/ancestor::div[4]//*[@class='col-sm-2 col-md-2 hidden-xs']//button[@type='button']
    /*    for(SelenideElement x: getPageByTitle(str).getElementsByName(mySubscribe)){
            x.click();
            getPageByTitle(str).getElementByName(unsubscribe).click();
        }*/

        Thread.sleep(5000);
    }


}