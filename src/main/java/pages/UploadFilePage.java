package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.nio.file.Path;

public class UploadFilePage extends PageBase{
    public UploadFilePage(WebDriver driver) {
        super(driver);
    }

    By fileUploadPicker = By.id("file-upload");
    By uploadBtn = By.id("file-submit");

   String filePath = "D:/SWD/AU/AUTP/resources/chromedriver.exe";

    public void uploadFileSuccessfully(){
        clickOnBTN(driver.findElement(fileUploadPicker));
        uploadFile(driver.findElement(fileUploadPicker),filePath );
        clickOnBTN(driver.findElement(uploadBtn));
    }
}
