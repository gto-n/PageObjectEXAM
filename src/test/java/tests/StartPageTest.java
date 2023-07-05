package tests;

import core.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginSuccessfulPage;
import pages.RegisterPage;
import pages.StartPage;
import utils.WaitTool;


public class StartPageTest extends BaseTest {

    @Test
    public void startPage() {
        StartPage.goToLoginPage();
        StartPage.clickMyAccountButton();
        StartPage.clickRegisterButton();
        RegisterPage.writeFirstname("Galya");
        RegisterPage.writeLastname("Nikolova");
        RegisterPage.writeEmail();
        RegisterPage.writePhoneNumber();
        RegisterPage.writePassword("123456");
        RegisterPage.confirmPassword("123456");
        RegisterPage.clickAgreeCheckbox();
        RegisterPage.clickContinueButton();
        LoginSuccessfulPage.verifyLogin();
    }
 }

