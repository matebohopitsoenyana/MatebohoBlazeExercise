package Steps;

import Pages.CustomerLoginPage;
import Utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
final WebDriver driver = BrowserFactory.startBrowser("CHROME","http://www.way2automation.com/angularjs-protractor/banking/#/login");
CustomerLoginPage customerLoginPage = PageFactory.initElements(driver, CustomerLoginPage.class);
}
