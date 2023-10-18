package fastType.com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
               
        },
        features = "src/test/resources/features",
        glue = "fastType/com/stepDefs",
        dryRun = false,
        tags = "",
        publish = true //generating a report with public link
)
public class CukesRunner {}