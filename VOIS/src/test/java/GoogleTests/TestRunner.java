package GoogleTests;

import BrowserActions.BrowserActions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;

@CucumberOptions
        (
                monochrome = true,
                features={"./src/test/java/GoogleTests/Google.feature"}
        )

public class TestRunner extends AbstractTestNGCucumberTests {
        @AfterTest
        public void endSession(){
                BrowserActions.quitBrowser();
        }
}