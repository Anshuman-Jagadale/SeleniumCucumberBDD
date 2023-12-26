package pages;

import utils.Hooks;
import org.openqa.selenium.WebDriver;

public class PagesBase {
    protected WebDriver driver = Hooks.GetDriver();
    protected LoginPage loginPage;
    protected GoogleSearchPage googleSearchPage;
}
