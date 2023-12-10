package core;

import core.Hooks;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class TestBase {
    protected WebDriver driver = Hooks.GetDriver();
    protected LoginPage loginPage;
}
