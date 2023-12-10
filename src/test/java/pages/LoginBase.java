package pages;

import utils.Hooks;
import org.openqa.selenium.WebDriver;

public class LoginBase {
    protected WebDriver driver = Hooks.GetDriver();
    protected LoginPage loginPage;
}
