package steps;

import io.cucumber.java.Before;
import Setting.testSetting;

public class HookTest {
    @Before
    public void setUp(){
        testSetting.start();
    }
}
