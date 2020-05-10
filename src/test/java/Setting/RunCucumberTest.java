package Setting;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.qameta.allure.Epic;
import org.junit.runner.RunWith;
@Epic("aaaaaa")
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},
        glue =      {"steps"},
        plugin =    {"pretty"}
        )
public class RunCucumberTest {


}
