package steps;

import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Тогда;
import page.MainPage;
import page.TopicPage;

import java.util.List;

import static Setting.testSetting.SITE_URL;
import static page.AbstractPage.getPageByTitle;

public class StepWritePost {


    @И("на {string} открыть  {string}")
    public void наОткрыть(String str, String topic) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(3000);
        getPageByTitle(str).getElementByName(topic).click();
        Thread.sleep(5000);

    }
    @И("на {string} кликнуть кнопку ответить {string}")
    public void наКликнутьКнопкуОтветить(String str, String response) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(1000);
        getPageByTitle(str).getElementByName(response).click();
    }

    @И("на {string} написать текст {string} в форму ответа")
    public void наНаписатьТекстВФормуОтвета(String str, String textBox) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(3000);
        getPageByTitle(str).getElementByName(textBox).val(SITE_URL);
    }

    @И("на {string} кликнуть на кнопку отправить ответ {string}")
    public void наКликнутьНаКнопкуОтправитьОтвет(String str, String answer) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(3000);
        getPageByTitle(str).getElementByName(answer).click();
    }

    @И("на {string} проверить появился ли ответ появился ли {string}")
    public void наПроверитьПоявилсяЛиОтветПоявилсяЛи(String str, String checkText) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(3000);
        getPageByTitle(str).getElementByName(checkText);
    }

    @И("на {string} перейти на вкладку темы {string}")
    public void наПерейтиНаВкладкуТемы(String str, String theme) throws ClassNotFoundException, InterruptedException {
        Thread.sleep(3000);
        getPageByTitle(str).getElementByName(theme).click();
    }


    @Тогда("повторить шаги")
    public void повторитьШаги() {

    }
}
