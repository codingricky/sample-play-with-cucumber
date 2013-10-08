import com.google.inject.AbstractModule;
import play.test.TestBrowser;

import static play.test.Helpers.FIREFOX;
import static play.test.Helpers.testBrowser;

public class CucumberModule extends AbstractModule {

    private TestBrowser testBrowser = testBrowser(FIREFOX, 3333);

    @Override
    protected void configure() {
        bind(TestBrowser.class).toInstance(testBrowser);
        requestStaticInjection(RunTest.class);
    }
}
