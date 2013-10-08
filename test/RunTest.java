
import com.google.inject.Inject;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import play.test.TestBrowser;
import play.test.TestServer;

import static play.test.Helpers.start;
import static play.test.Helpers.stop;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
public class RunTest {

}