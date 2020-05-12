package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.bs.A;
import cucumber.api.java.ru.И;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import page.subscribedPage;
import Setting.testSetting;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static page.AbstractPage.getPageByTitle;


public class subscribeStepdefs {
    List<String> listSubscribe = new ArrayList<>();
    List<SelenideElement> collection = new ArrayList<>();
    @И("на {string} нажать на кнопку подписки {string}")
    public void наНажатьНаКнопкуПодписки(String str, String inactive) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(800);
        getPageByTitle(str).getElementByName(inactive).click();

        listSubscribe.add(getPageByTitle(str)
                .getElementByName("Выбранный топик")
                .getAttribute("href")
                .replaceAll("https:\\/\\/dev.n7lanit.ru",""));
        testSetting.screenshot();
    }

    @И("на {string} в выпадающем меню нажать {string}")
    public void наВВыпадающемМенюНажать(String str, String sub) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(800);
        getPageByTitle(str).getElementByName(sub).should(visible).click();
        testSetting.screenshot();
    }

    @И("на {string} нажать на кнопку {string}")
    public void наНажатьНаКнопку(String str, String subscribes) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(800);
        getPageByTitle(str).getElementByName(subscribes).should(visible).click();
        testSetting.screenshot();
    }

    @И("Проверить – что среди отображающихся подписок есть те, на которые вы подписались ранее в этом сценарии")
    public void проверитьЧтоСредиОтображающихсяПодписокЕстьТеНаКоторыеВыПодписалисьРанееВЭтомСценарии() throws InterruptedException, ClassNotFoundException {
        Thread.sleep(800);
     /*   for (SelenideElement element: collection){
           $(element.getAttribute("href"));
            System.out.println("проверка объекта селенида");
        }*/
  /*      for(String s: listSubscribe){
            $(By.xpath("//*[@href='"+ s +"']")).should(Condition.visible);
        }*/
    }

    @И("на {string} {string} от всех подписок на которые вы подписались ранее в этом сценарии")
    public void наОтВсехПодписокНаКоторыеВыПодписалисьРанееВЭтомСценарии(String str, String unsubscribe) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(800);

        for(String s: listSubscribe){
            $(By.xpath("//*[@href='"+ s +"']/ancestor::div[4]//*[@class='col-sm-2 col-md-2 hidden-xs']//*[@class='col-xs-12 hidden-xs hidden-sm']" +
                    "//button[@type='button']")).click();
            getPageByTitle(str).getElementByName(unsubscribe).click();
            testSetting.screenshot();
        }

    }

}
