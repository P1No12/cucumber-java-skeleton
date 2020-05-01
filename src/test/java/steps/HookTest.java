package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import Setting.testSetting;

public class HookTest {
    @Before
    public void setUp(){
        testSetting.start();
    }

    @After
    public void SetClose() { testSetting.close();}

}
