package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends PageBase{
    public SecurePage(WebDriver driver) {
        super(driver);
    }

    By flash = By.id("flash");

    public String getAlertTxt(){
        return driver.findElement(flash).getText();
    }
}
