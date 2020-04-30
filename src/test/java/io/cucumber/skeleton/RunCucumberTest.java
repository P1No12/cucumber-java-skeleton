package io.cucumber.skeleton;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.Before;
import org.junit.runner.RunWith;
import page.BasePage;
import page.MainPage;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},
        glue =      {"steps"},
        plugin =    {"pretty"})
public class RunCucumberTest {

    @Before
    public void setUp(){

    }

}
