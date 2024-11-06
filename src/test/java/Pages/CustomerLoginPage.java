package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage {
    WebDriver driver;
    @FindBy(xpath = "//button[.='Customer Login']")
    WebElement customerLoginbtn;

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homebtn;

    @FindBy(xpath = "//button[.='Bank Manager Login']")
    WebElement managerLoginbtn;

    @FindBy(xpath = "//label[.='Your Name :']")
    WebElement userLabelDisplay;

    public void VerifyAllElements() {
        customerLoginbtn.isDisplayed();
        homebtn.isDisplayed();
        managerLoginbtn.isDisplayed();
    }

    public CustomerLoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickCustomerLogin()
    {
        customerLoginbtn.click();
    }

    public void verifyHomePage()
    {
        homebtn.isDisplayed();
    }

    public void clickCustomerLoginButton()
    {
        customerLoginbtn.click();
    }

    public void userLabel()
    {
        userLabelDisplay.isDisplayed();
    }


}
