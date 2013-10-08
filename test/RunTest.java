
import com.google.inject.Inject;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import play.test.FakeApplication;
import play.test.TestBrowser;
import play.test.TestServer;

import static play.test.Helpers.*;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
public class RunTest {

    private static TestServer testServer;

    @Inject
    static TestBrowser testBrowser;

    @BeforeClass
    public static void before() {
        FakeApplication fakeApplication = fakeApplication(inMemoryDatabase());
        testServer = testServer(3333, fakeApplication);
        start(testServer);
    }

    @AfterClass
    public static void after() {
        stop(testServer);
        testBrowser.quit();
    }
}