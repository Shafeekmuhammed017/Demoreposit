package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Design_cus_po {

    WebDriver driver;
    public WebDriverWait wait;
    public Design_cus_po(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,30);

    }
    @FindBy(xpath = "//span[contains(text(),'Thobe')]")
    private WebElement Thobelinkheader;
    @FindBy(xpath = "//button[contains(text(),'DESIGN')]")
    private WebElement Designlink;
    @FindBy(xpath = "//h2[text()='Saudi']")
    private WebElement Subcategory_link;
    @FindBy(xpath = "//a[contains(text(),'EFFA ALL DABBAGH')]")
    private WebElement sellername;
    @FindBy(xpath = "(//a[contains(text(),'Design arfan one')and @class='product-name'])[1]")
    private WebElement designproduct;

    public void design_customization_flow() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(Thobelinkheader));
        Thobelinkheader.click();
        wait.until(ExpectedConditions.visibilityOf(Designlink));
        Designlink.click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(Subcategory_link));
        Subcategory_link.click();
        wait.until(ExpectedConditions.visibilityOf(sellername));
        sellername.click();


    }




}
