package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.ru.И;
import io.qameta.allure.Step;

import static Setting.testSetting.*;
import static com.codeborne.selenide.Selenide.open;
import static page.AbstractPage.getPageByTitle;
import static page.AbstractPage.getUrlByTitle;

public class loginStepDefs {

    @Step("Проверка разности числа и числа 1")
    @И("открываем страницу {string}")
    public void открываемСтраницу(String site) throws ClassNotFoundException {
        open(getUrlByTitle(site));
        }
    @Step("Проверка разности числа  и числа 22")
    @И("на {string} кликнуть в навигационном баре кнопку войти {string}")
    public void наКликнутьВНавигационномБареКнопкуВойти(String str, String nameEL) throws ClassNotFoundException {
        getPageByTitle(str).getElementByName(nameEL).click();

    }
    @Step("Проверка разности числа  и числа 3")
    @И("на {string} ввести логин {string}")
    public void наВвестиЛогин(String str, String login) throws  ClassNotFoundException {
       getPageByTitle(str).getElementByName(login).val(USER_LOGIN);
    }
    @Step("Проверка разности числа  и числа 4")
    @И("на {string} ввести пароль {string}")
    public void наВвестиПароль(String str, String pass) throws ClassNotFoundException {
        getPageByTitle(str).getElementByName(pass).val(USER_password);
    }
    @Step("Проверка разности числа  и числа 5")
    @И("на {string} клинуть {string}")
    public void наИклинутьКнопкуВойти(String str, String signUp) throws ClassNotFoundException {
        getPageByTitle(str).getElementByName(signUp).should(Condition.visible).click();

    }
    @Step("Проверка разности числа  и числа 6")
   @И("на {string} проверить видна ли {string}")
    public void наПроверитьВиднаЛи(String str, String icons) throws ClassNotFoundException {
        getPageByTitle(str).getElementByName(icons).should(Condition.image);

    }
}
