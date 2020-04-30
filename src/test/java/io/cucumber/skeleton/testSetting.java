package io.cucumber.skeleton;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import page.MainPage;

import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;

public class testSetting {

    @Before
    public void start(){
        startMaximized= true;
        timeout= 7000;
        clearBrowserCookies();
        WebDriverRunner.clearBrowserCache();

        MainPage main;
    }
}
