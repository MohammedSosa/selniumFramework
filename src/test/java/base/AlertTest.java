package base;

import org.testng.annotations.Test;
import pages.AlertPage;
import pages.DropDownPage;

public class AlertTest extends BaseTest{


    @Test
public void testAlert(){
    AlertPage alertPage  = homePage.clickOnAlertLink();
    alertPage.clickOnConfirmAlert();
    alertPage.acceptAlertYes();

}

}
