package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.cssSelector("#login button");


    public void setUserName (String UserName){
        driver.findElement(username).sendKeys(UserName);
    }
    public void setPassWord (String PassWord){
        driver.findElement(password).sendKeys(PassWord);
    }

    public SecurePage clickOnLoginButton ( ){
        driver.findElement(loginBtn).click();
        return new SecurePage (driver);
    }


}
