package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.WaitTool;

public class LoginSuccessfulPage  extends BasePage {

    private static final By SUCCESS_BUTTON = By.cssSelector("#common-success > ul > li:nth-child(3) > a");
        public static void verifyLogin() {
            WebElement successButton = WaitTool.waitForElementVisibility(SUCCESS_BUTTON, 3);
            Assert.assertTrue(successButton.isDisplayed(), "Success!");
    }
}
