package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class StartPage extends BasePage {

    private static final By MY_ACCOUNT_BUTTON = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
    private static final By REGISTER_BUTTON = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
    private static final String START_PAGE_URL = "http://shop.pragmatic.bg";


    public static void goToLoginPage() {
        driver.get(START_PAGE_URL);
    }

    public static void clickMyAccountButton() {
        clickOnElementByLocator(MY_ACCOUNT_BUTTON);
    }

    public static void clickRegisterButton() {
        clickOnElementByLocator(REGISTER_BUTTON);
    }
}
