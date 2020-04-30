package page;

import static com.codeborne.selenide.Selenide.open;

public class MainPage extends BasePage {
    static String SITE_URL = "https://dev.n7lanit.ru";

     public void goTo () {
        open(SITE_URL);
    }


}
