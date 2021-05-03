package Base_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseTestCreation {

    public WebDriver driver;
    @BeforeTest
    public void setup_driver() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();
        System.out.println("driver set up done successfully in BeforeTest method.");

    }
    @BeforeClass
    public void geturl()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://qa.melbasi.com/en/");
        driver.manage().window().maximize();

    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println(driver.getCurrentUrl());
        System.out.println("Before method annotations works");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After method annotations works");
    }

    @AfterClass
    public void afterClass()
    {
      //  driver.close();
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("After test method runs");
    }


}

