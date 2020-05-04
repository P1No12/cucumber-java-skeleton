package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.ru.И;
import static Setting.testSetting.*;
import static com.codeborne.selenide.Selenide.open;
import static page.AbstractPage.getPageByTitle;
import static page.AbstractPage.getUrlByTitle;

public class loginStepDefs {


    @И("открываем страницу {string}")
    public void открываемСтраницу(String site) throws ClassNotFoundException, InterruptedException {
        open(getUrlByTitle(site));
    }

    @И("на {string} кликнуть в навигационном баре кнопку войти {string}")
    public void наКликнутьВНавигационномБареКнопкуВойти(String str, String nameEL) throws ClassNotFoundException, InterruptedException {
        getPageByTitle(str).getElementByName(nameEL).click();

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
        getPageByTitle(str).getElementByName(signUp).should(Condition.visible).click();

    }

   @И("на {string} проверить видна ли {string}")
    public void наПроверитьВиднаЛи(String str, String icons) throws ClassNotFoundException, InterruptedException {
        getPageByTitle(str).getElementByName(icons).should(Condition.image);

    }
}
