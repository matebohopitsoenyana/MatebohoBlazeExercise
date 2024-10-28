package StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    WebDriver driver;
    @Given("I'm in the login page")
    public void i_m_in_the_login_page() {
        driver = new ChromeDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
        driver.manage().window().maximize();

    }
    @And("Click Customer Login button")
    public void click_customer_login_button() {
     //   driver.switchTo().frame("//div[@class='box mainhdr']");
        driver.findElement(By.xpath("//div[@class='box mainhdr']")).isDisplayed();
//        driver.switchTo().frame("//div[@class='borderM box padT20']");
//        driver.findElement(By.name("Customer Login"));


    }
    @And("Select Customer Name (.*)$")
    public void select_customer_name(String customerName) {


    }
    @When("I click Login button")
    public void i_click_login_button() {

    }
    @Then("User page displayed")
    public void user_page_displayed() {

    }
}
