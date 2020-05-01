package Setting;



import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.Wait;

public class testSetting {

    public static final String USER_LOGIN = "haiku";
    public static final String USER_password = "123123Qq";
    public static final String SITE_URL = "https://dev.n7lanit.ru";

    public static void start(){

        Configuration.startMaximized= true;
        Configuration.timeout= 5000;
    }

    public static void close(){
    }
}
