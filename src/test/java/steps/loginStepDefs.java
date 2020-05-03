package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Тогда;
import page.MainPage;

import java.lang.reflect.InvocationTargetException;

import static Setting.testSetting.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static page.AbstractPage.getPageByTitle;
import static page.AbstractPage.getUrlByTitle;

public class loginStepDefs {
    MainPage main = new MainPage();


    @И("открываем страницу {string}")
    public void открываемСтраницу(String site) throws ClassNotFoundException, InterruptedException {
        open(getUrlByTitle(site));
        Thread.sleep(2000);
    }

    @И("на {string} кликнуть в навигационном баре кнопку войти {string}")
    public void наКликнутьВНавигационномБареКнопкуВойти(String str, String nameEL) throws ClassNotFoundException, InterruptedException {
        getPageByTitle(str).getElementByName(nameEL).click();
        Thread.sleep(2000);
    }

    @И("на {string} ввезти логин {string}")
    public void наВвезтиЛогин(String str, String login) throws  ClassNotFoundException {
       getPageByTitle(str).getElementByName(login).val(USER_LOGIN);
    }

    @И("на {string} ввезти пароль {string}")
    public void наВвезтиПароль(String str, String pass) throws ClassNotFoundException {
        getPageByTitle(str).getElementByName(pass).val(USER_password);
    }

    @И("на {string} клинуть {string}")
    public void наИклинутьКнопкуВойти(String str, String signUp) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(3500);
        getPageByTitle(str).getElementByName(signUp).click();
        Thread.sleep(5000);

    }

   @И("на {string} проверить видна ли {string}")
    public void наПроверитьВиднаЛи(String str, String icons) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(2000);
        getPageByTitle(str).getElementByName(icons).should(Condition.image);
       Thread.sleep(5000);

    }
}
