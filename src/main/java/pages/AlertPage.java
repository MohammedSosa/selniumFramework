package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class AlertPage extends PageBase{
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    By alertTriggerBtn = By.xpath(".//button[@onclick='jsConfirm()']");

    public void clickOnConfirmAlert(){
        clickAndMoveToAlert(driver.findElement(alertTriggerBtn));
    }
    public void acceptAlertYes(){
        acceptAlert();    }



}
