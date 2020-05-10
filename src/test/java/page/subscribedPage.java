    package page;

    import com.codeborne.selenide.ElementsCollection;
    import com.codeborne.selenide.SelenideElement;
    import cucumber.api.java.es.E;
    import org.openqa.selenium.By;
    import page.annotations.Element;
    import page.annotations.Page;

    import static com.codeborne.selenide.Selenide.$;
    import static com.codeborne.selenide.Selenide.$$;

    @Page(title = "Страница подписок", url =  "https://dev.n7lanit.ru/subscribed/")
    public class subscribedPage extends AbstractPage{

        @Element("")
        public SelenideElement subscriberMenu(){
            return $(By.xpath("//div[@class='col-sm-2 col-md-2 hidden-xs']//div[@class='col-xs-12 hidden-md hidden-lg']" +
                    "/button[@type='button']/span[text()='star_half']/.."));
        }

        @Element("Отписаться")
        public SelenideElement unsubscribe(){
            return $(By.xpath("//div[@class='col-xs-12 hidden-xs hidden-sm']//*[@class='btn-group open']//button//span[text()='star_border']/.."));
            //return $(By.xpath("//*[@id='modal-mount']//*[contains(text(),'Отписаться')]"));
        }

        @Element("Мои подписки")
        public ElementsCollection mySubscribe(){
            ElementsCollection collection=  $$(By.xpath("//div[@class='col-sm-2 col-md-2 hidden-xs']//div[@class='col-xs-12 hidden-xs hidden-sm']//*[@class='btn-group']/button"));
            return collection;
        }

    }
