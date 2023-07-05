package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang3.RandomStringUtils;
import java.time.Duration;

public class RegisterPage extends BasePage {
    private static final By FIRSTNAME = By.id("input-firstname");
    private static final By LASTNAME = By.id("input-lastname");
    private static final By EMAIL_INPUT_FIELD = By.id("input-email");
    private static final By PHONE_INPUT_FIELD = By.id("input-telephone");
    private static final By PASSWORD_INPUT_FIELD =  By.id("input-password");
    private static final By CONFIRM_INPUT_FIELD = By.id("input-confirm");
    private static final By AGREE_CHECKBOX = By.name("agree");
    private static final By CONTINUE_BUTTON = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

    public static void writeFirstname(String firstname) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(13));
        wait.until(ExpectedConditions.presenceOfElementLocated(RegisterPage.FIRSTNAME));
        driver.findElement(FIRSTNAME).sendKeys(firstname);
  }

    public static void writeLastname(String lastname) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(13));
        wait.until(ExpectedConditions.visibilityOfElementLocated(RegisterPage.LASTNAME));
        driver.findElement(LASTNAME).sendKeys(lastname);
    }
    public static String randomEmailGenerate(){
        String prefix = RandomStringUtils.randomAlphabetic(6);
        String suffix = RandomStringUtils.randomAlphabetic(5);
        String domain = RandomStringUtils.randomAlphabetic(3);
        String emailAddress = prefix + "@" + suffix + "." + domain;
        return emailAddress;
    }
    public static void writeEmail() {
        String emailAddress = randomEmailGenerate();
        driver.findElement(EMAIL_INPUT_FIELD).sendKeys(emailAddress);
      }
      public static String phoneNumberGenerate(){
          String phoneNumber = RandomStringUtils.randomNumeric(8);
          return  phoneNumber;
      }

    public static void writePhoneNumber() {
        String phoneNumber = phoneNumberGenerate();
        driver.findElement(PHONE_INPUT_FIELD).sendKeys(phoneNumber);
    }

    public static void writePassword(String password) {
        driver.findElement(PASSWORD_INPUT_FIELD).sendKeys(password);
    }
    public static void confirmPassword(String password) {
        driver.findElement(CONFIRM_INPUT_FIELD).sendKeys(password);
    }
    public static void clickAgreeCheckbox() {
        clickOnElementByLocator(AGREE_CHECKBOX);
    }
    public static void clickContinueButton() {
        clickOnElementByLocator(CONTINUE_BUTTON);
    }
}
