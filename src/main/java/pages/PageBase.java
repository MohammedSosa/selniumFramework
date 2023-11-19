package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;

public class PageBase {

    public WebDriver driver;

    public PageBase (WebDriver driver){
        this.driver=driver;
    }

    public void clickOnLink(String linkTxt){
        driver.findElement(By.linkText(linkTxt)).click();
    }

    public void selectFromDropDown(WebElement element , String option){
        Select dropDownElement = new Select(element);
        dropDownElement.selectByVisibleText(option);
    }

    public void clickAndMoveToAlert(WebElement element){
        element.click();    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();    }

    public void clickOnBTN(WebElement element){
        element.click();    }

    public void uploadFile(WebElement element,String path){
        element.sendKeys(path);
    }

}
