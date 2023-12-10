package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.browser_manager.DriverManager;
import utils.browser_manager.DriverManagerFactory;
import utils.browser_manager.DriverType;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;
    private DriverManager driverManager;
    private static int numberOfCase = 0;

    @Before
    public void Initialize() {
        numberOfCase++;
        System.out.println("Start of Test Scenario : " + numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.GetDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void TearDown() {
        System.out.println("Test Scenario : " + numberOfCase + " Finished");
        driverManager.QuitDriver();
    }

    public static WebDriver GetDriver() {
        return driver;
    }

}




