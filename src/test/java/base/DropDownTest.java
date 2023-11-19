package base;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.LoginPage;
import pages.SecurePage;

import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest{


    @Test
public void testDropDown(){
    DropDownPage dropPage = homePage.clickOnDropDownLink();
    dropPage.selectOptionFromDDL("Option kn1");

}

}
