package steps;

import io.cucumber.java.Before;
import io.cucumber.skeleton.testSetting;

public class HookTest {
    @Before
    public void setUp(){
        testSetting.start();
    }
}
