package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Region_Selection {
    public WebDriver driver;
    public WebDriverWait wait;
    public Region_Selection(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="preferred_location")
    private WebElement location;

    @FindBy(id="popular_cities_25")
    private WebElement locationChoose;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    private WebElement submit;

    @FindBy(xpath = "//h2[contains(text(),'Select your Preferred Location')]")
    private WebElement regionSelectionpopup;

    @FindBy(xpath = "//div[@class='dor-block-selection']//div//button[@type='button']//i")
    private WebElement accountButton;

    @FindBy(xpath = "//a[@class='link-myaccount']")
    private WebElement myaccount;

    @FindBy(xpath ="//div[@class='nav-setting-button']//button[@type='button']//i")
    private WebElement myaccount_dropdown;

    @FindBy(xpath ="//a[@class='link-myaccount' and @title='View my customer account']")
    private WebElement myaccountt;

    @FindBy(xpath = "//a[contains(text(),'Create one here')]")
    private WebElement registerlink;

    @FindBy(xpath = "//h3[contains(text(),'Create Account')]")
    private WebElement registerpage;

    public void locationSelection() throws InterruptedException {
        if (regionSelectionpopup.isDisplayed()) {
            locationChoose.isDisplayed();
            locationChoose.click();
            submit.click();
            Thread.sleep(3000);

        } else {
            location.isDisplayed();
            location.click();
            locationChoose.click();
            submit.click();
            Thread.sleep(3000);

        }

    }

    public void movetologin() throws InterruptedException {
        wait=new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(myaccount_dropdown));
        Actions mouse = new Actions(driver);
        mouse.moveToElement(myaccount_dropdown).click().build().perform();
        wait.until(ExpectedConditions.visibilityOf(myaccountt));
        myaccountt.click();
        registerlink.isDisplayed();




    }
}
