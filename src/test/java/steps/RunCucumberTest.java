package steps;

import io.cucumber.java.Before;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

import io.cucumber.skeleton.testSetting;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},
        glue =      {"steps"},
        plugin =    {"pretty"})
public class RunCucumberTest {


}
