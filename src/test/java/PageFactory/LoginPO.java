package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPO {
    public WebDriver driver;
    public WebDriverWait wait;

    public LoginPO(WebDriver driver) {
        this.driver= driver;
        //This initElements method will create all WebElements
        wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver,this);
    }


    @FindBy(name = "phone")
    private  WebElement username;
    @FindBy(name="password")
    private  WebElement passwordd;
    @FindBy(id="submit-login")
    private  WebElement submit_button;
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    private WebElement accountlogged;

    public void logincustomer()
    {
        username.isDisplayed();
        username.sendKeys("8921054244");
        passwordd.isDisplayed();
        passwordd.sendKeys("1234567890");
        submit_button.click();
        wait.until(ExpectedConditions.visibilityOf(accountlogged));


    }

}
