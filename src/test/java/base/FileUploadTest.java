package base;

import org.testng.annotations.Test;
import pages.HomePage;

public class FileUploadTest extends BaseTest{

    @Test
    public void verifyUploadFileSuccessfully(){
        var fileUploadObject = homePage.clickOnFileUploadLink();
        fileUploadObject.uploadFileSuccessfully();

    }
}
