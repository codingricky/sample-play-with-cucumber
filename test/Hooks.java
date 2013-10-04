import cucumber.api.java.After;
import cucumber.api.java.Before;
import play.test.FakeApplication;
import play.test.TestBrowser;
import play.test.TestServer;

import static play.test.Helpers.*;

public class Hooks {

    public static TestBrowser browser;
    private TestServer testServer;

    @Before
    public void beforeScenario() {
        FakeApplication fakeApplication = fakeApplication(inMemoryDatabase());
        testServer = testServer(3333, fakeApplication);
        start(testServer);
        browser = testBrowser(FIREFOX, 3333);
    }

    @After
    public void afterScenario() {
        stop(testServer);
        browser.quit();
    }
}
