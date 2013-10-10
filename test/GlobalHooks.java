import com.google.inject.Inject;
import cucumber.api.java.Before;
import play.test.TestBrowser;
import play.test.TestServer;

import static play.test.Helpers.start;

public class GlobalHooks {

    @Inject
    private TestServer testServer;

    @Inject
    private TestBrowser testBrowser;

    private static boolean initialised = false;

    @Before
    public void before() {
        if (!initialised) {
            System.out.println("starting...");
            start(testServer);
            initialised = true;

            Runtime.getRuntime().addShutdownHook(new Thread("Cleaning up") {
                @Override
                public void run() {
                    testBrowser.quit();
                    play.test.Helpers.stop(testServer);
                }

            });
        }
    }

}
