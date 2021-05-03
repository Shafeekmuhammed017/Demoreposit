package TestScript;

import Base_Test.BaseTestCreation;
import PageFactory.Design_cus_po;
import PageFactory.LoginPO;
import PageFactory.Region_Selection;
import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testscript extends BaseTestCreation {
    @Test(priority = 1,description = "Region selection")
    public void Rgselection()
    {
        try {

            Region_Selection rs = new Region_Selection(driver);
            rs.locationSelection();
            System.out.println("===Location selection done Successfully=====");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Failed test case");
        }
    }
    @Test(priority=2,description = "Navigate to login screen")
    public void navigateTologin()
    {
      try {
          Region_Selection rs =new Region_Selection(driver);
          rs.movetologin();
          System.out.println("Login page displayed fine ");
      }
      catch (Exception e)
      {
          e.printStackTrace();
          Assert.fail("Failed test case");
      }

    }
    @Test(priority = 3,description = "Login as customer")
    public void login()
    {
        try {

            LoginPO lg = new LoginPO(driver);
            lg.logincustomer();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Failed Test case");
        }

    }
    @Test(priority =4,description = "Design customization flow")
    public void design_customization_flow_order()
    {
        try {
            Design_cus_po dc = new Design_cus_po(driver);
            dc.design_customization_flow();
        }
        catch (Exception e)
        {
            Assert.fail("Test case Failed : ",e);
        }

    }
}
