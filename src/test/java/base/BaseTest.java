package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utilities.Helper;

public class BaseTest {
    public HomePage homePage;
    private WebDriver driver;


    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver.","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }




    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void screenshotInFailure(ITestResult result){
        if (result.getStatus()== ITestResult.FAILURE){
            System.out.println("Failed , Waiting while taking a Screenshot");
            Helper.takeScreenShot(driver, result.getName());
        }

    }


}
