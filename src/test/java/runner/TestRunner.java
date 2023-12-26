package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utils","stepdefinitions"},
        plugin = { "pretty", "html:target/cucumber-reports/report.html"},
        monochrome = true,
        tags = "@Non-UI"
)
public class TestRunner {
    //Initialize report generator
    @AfterClass
    public static void initReport() {

        try {
            System.out.println("Generating report");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Report generated successfully");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
