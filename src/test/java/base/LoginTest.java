package base;

import org.testng.ITest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecurePage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest{

    String UserName ="tomsmith";
    String PassWord = "SuperSecretPassword!";

    @Test
public void testSuccessfulLogin(){
    LoginPage loginPage = homePage.clickOnFormAuthLink();
    loginPage.setUserName(UserName);
    loginPage.setPassWord(PassWord);
    SecurePage securePage = loginPage.clickOnLoginButton();
    assertTrue(securePage.getAlertTxt().contains("You logged into a secure area!"));
}

}
