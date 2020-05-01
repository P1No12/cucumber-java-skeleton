package Setting;

import com.codeborne.selenide.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import page.MainPage;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.Wait;

public class testSetting {

    public static final String USER_LOGIN = "haiku";
    public static final String USER_password = "123123Qq";
    public static final String SITE_URL = "https://dev.n7lanit.ru";

    public static void start(){

        startMaximized= true;
        timeout= 10000;
    }
}
