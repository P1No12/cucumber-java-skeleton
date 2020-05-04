package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import static Setting.testSetting.close;
import static Setting.testSetting.start;

public class HookTest {

    @Before
    public void before() {
      start();
    }

    @After
    public void after() {
        close();
    }
}
