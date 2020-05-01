package Setting;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},
        glue =      {"steps"},
        plugin =    {"pretty"})
public class RunCucumberTest {


}