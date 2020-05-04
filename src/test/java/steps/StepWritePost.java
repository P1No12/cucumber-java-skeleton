package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Тогда;
import static Setting.testSetting.TEXT_MASSAGE;
import static page.AbstractPage.getPageByTitle;

public class StepWritePost {

    @И("на {string} открыть  {string}")
    public void наОткрыть(String str, String topic) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(800);
        getPageByTitle(str).getElementByName(topic).should(Condition.visible).click();
    }

    @И("на {string} кликнуть кнопку ответить {string}")
    public void наКликнутьКнопкуОтветить(String str, String response) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(800);
        getPageByTitle(str).getElementByName(response).should(Condition.visible).click();
    }


    @И("на {string} написать текст {string} в форму ответа")
    public void наНаписатьТекстВФормуОтвета(String str, String textBox) throws ClassNotFoundException {
        getPageByTitle(str).getElementByName(textBox).val(TEXT_MASSAGE);
    }


    @И("на {string} кликнуть на кнопку отправить ответ {string}")
    public void наКликнутьНаКнопкуОтправитьОтвет(String str, String answer) throws ClassNotFoundException {
        getPageByTitle(str).getElementByName(answer).should(Condition.visible).click();
    }


    @И("на {string} проверить появился ли ответ появился ли {string}")
    public void наПроверитьПоявилсяЛиОтветПоявилсяЛи(String str, String checkText) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(800);
        getPageByTitle(str).getElementByName(checkText).should(Condition.visible);
    }

    @И("на {string} перейти на вкладку темы {string}")
    public void наПерейтиНаВкладкуТемы(String str, String theme) throws ClassNotFoundException {
        getPageByTitle(str).getElementByName(theme).should(Condition.visible).click();
    }

    @Тогда("повторить шаги")
    public void повторитьШаги() {

    }

}
