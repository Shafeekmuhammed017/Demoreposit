package Base_Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.FileInputStream;
import java.util.Properties;


  public class BasePage {
        public WebDriver driver;
        public WebDriverWait wait;
        public JavascriptExecutor executor;



        public BasePage(WebDriver driver)
        {
            this.driver=driver;
            wait=new WebDriverWait(driver,120);
            PageFactory.initElements(driver,this);
            executor=(JavascriptExecutor)driver;

        }

        public void waitandClickElement(WebElement element)
        {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                Reporter.log("Element Clicked",true);
            }catch (Exception ex)
            {
                Reporter.log("Element not Clicked or Not Found",true);
                Assert.fail();
            }
        }

        public void verifyTitle(String title) {
            try {
                wait.until(ExpectedConditions.titleContains(title));
                Reporter.log("Title is matching", true);


            } catch (Exception e) {
                Reporter.log("Title is not matching");
                Assert.fail();
            }
        }

        public void visibleElement(WebElement element, String elementName) {
            try {
                wait.until(ExpectedConditions.visibilityOf(element));
                Reporter.log(elementName + " is present", true);
            } catch (Exception e) {
                Reporter.log(elementName + " not found ", true);
                Assert.fail();
            }
        }

        //Function to Compare two texts
        public void verifyText(WebElement element, String expectedText) {
            try {
                Assert.assertEquals(element.getText(), expectedText);
                Reporter.log("Text is present", true);
            } catch (Exception ex) {
                Reporter.log("Text not Present");
                Assert.fail();
            }
        }


        public void select_By_value_from_list(WebElement element, String text) {
            try {
                Select element_to_be_selected = new Select(element);
                element_to_be_selected.selectByVisibleText(text);
            } catch (Exception e) {
                System.out.println("Exception occured while selecting from dropdown" + e.toString());
            }
        }

}
