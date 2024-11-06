package Steps;

import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customerLoginSteps extends Base {
    WebDriver driver;
  //  driver = new ChromeDriver();
    @Given(": I'm in a Login Page")
    public void i_m_in_a_login_page() throws InterruptedException {
        Thread.sleep(10000);
        customerLoginPage.verifyHomePage();
    }

    @And(":All Elements are displayed")
    public void all_elements_are_displayed() throws InterruptedException {
        Thread.sleep(5000);
        customerLoginPage.VerifyAllElements();
    }

    @When("Click Customer Login button")
    public void i_click_login_button() throws InterruptedException {
        Thread.sleep(10000);
        customerLoginPage.clickCustomerLogin();

    }

    @Then("Customer name selection page is displayed")
    public void customer_name_selection_page_is_displayed() throws InterruptedException {
        Thread.sleep(10000);
        customerLoginPage.userLabel();
    }

    public void addScreenshot(Scenario scenario){
        if (scenario.isFailed()){
            byte[]screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", String.valueOf(scenario));
        }

    }

    @After
    public void quitBrowser() {
        driver = new ChromeDriver();
        driver.quit();
    }
}

