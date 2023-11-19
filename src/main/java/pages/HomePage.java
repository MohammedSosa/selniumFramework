package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    //loginFormLink = By.linkText("Form Authentication");

   /* public LoginPage clickOnFormAuthLink(){
        driver.findElement(loginFormLink).click();
        return new LoginPage(driver);
    }*/

    public LoginPage clickOnFormAuthLink(){
        clickOnLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickOnDropDownLink(){
        clickOnLink("Dropdown");
        return new DropDownPage(driver);
    }

    public AlertPage clickOnAlertLink(){
        clickOnLink("JavaScript Alerts");
        return new AlertPage(driver);
    }

    public UploadFilePage clickOnFileUploadLink(){
        clickOnLink("File Upload");
        return new UploadFilePage(driver);
    }
}
