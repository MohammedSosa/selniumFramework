package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownPage extends PageBase{
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    By dropDown = By.id("dropdown");

    public void selectOptionFromDDL(String Option){
        selectFromDropDown(driver.findElement(dropDown),Option );
    }

}
