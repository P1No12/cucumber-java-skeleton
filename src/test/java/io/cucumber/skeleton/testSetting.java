package io.cucumber.skeleton;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import page.MainPage;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class testSetting {

    @Before
    public void start(){
        startMaximized= true;
        timeout= 7000;
        clearBrowserCookies();
        WebDriverRunner.clearBrowserCache();

        MainPage main;
    }

    
    @Test
    public void mainPage() throws InterruptedException {

        open("https://dev.n7lanit.ru/?ref=login");
        $(By.xpath("//*[@type='button' and text() = 'Войти']")).click();

        SelenideElement userBox = $(By.id("id_username"));
        userBox.val("haiku");
        SelenideElement passwordBox = $(By.id("id_password"));

        passwordBox.val("123123Qq").pressEnter();

        $(By.xpath("//*[@id='user-menu-mount']//img[@class='user-avatar']")).should(Condition.visible);

        ElementsCollection collection=  $$(By.xpath(
                "//span[@class='thread-detail-replies' and not(preceding-sibling::span)]/ancestor::div[3]/a"));
        collection.get((int) (collection.size()*Math.random())).click();

        SelenideElement answer = $(By.xpath("//*[@class='col-sm-4 hidden-xs']/button"));
        answer.should(Condition.visible).click();

        SelenideElement textBox = $(By.id("editor-textarea"));
        textBox.val("Разлито сакэ\n" +
                "Самурай понурился\n" +
                "Испорчен вечер");
        Thread.sleep(5000);
        $(By.xpath("//*[@id='posting-mount']//*[@type='submit']")).shouldBe(Condition.visible).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@class='panel-body']//*[text()='haiku' and 'Разлито сакэ'and 'Самурай понурился' and 'Испорчен вечер']"))
                .should(Condition.visible);
        Thread.sleep(5000);

        $(By.xpath("//*[@role='navigation']//*[contains(text(), 'Темы')]")).should(Condition.visible).click();

        Thread.sleep(15000);

    }


}
