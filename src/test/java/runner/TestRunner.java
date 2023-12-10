package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"core"},
        plugin = {"json:test/report/cucumber_report.json"}
        , tags = "@FunctionalTest"
)


public class TestRunner {

    //Initialize report generator
    @AfterClass
    public static void initReport() {

        try {
            System.out.println("Generating report");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Report generated sucesfully");


        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }
}
