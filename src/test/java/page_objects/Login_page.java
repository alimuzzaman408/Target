package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
    private final By Sign_in_from_menu = By.xpath("//span[@class='sc-gsTCUz dZNyey']//div[@class='sc-hKgILt gTLZXx']//*[local-name()='svg']");
    private final By sign_in_dropdown = By.xpath("//div[normalize-space()='Sign in']");
    private final By user = By.xpath("//input[@id='username']");
    private final By pass = By.xpath(" //input[@id='password']");
    private final By click_log_in = By.xpath(" //button[normalize-space()='Sign in']");
    private final By error_message1 = By.xpath("//input[@id='username']/following::span[text()='Please enter a valid password'][2]");

    private static final Logger LOGGER = LogManager.getLogger(Login_page.class);

    WebDriver driver;

    public Login_page(WebDriver driver) {
        this.driver = driver;
    }

    public Login_page click_signIn_from_list() throws InterruptedException {
        ActOn.element(driver, Sign_in_from_menu).click();
        Thread.sleep(1000);
        ActOn.element(driver, sign_in_dropdown).click();
        Thread.sleep(1000);
        return this;
    }

    public Login_page set_username(String user1){
        ActOn.wait(driver,user).waitForElementToBeVisible();
        ActOn.element(driver, user).setValue(user1);
        LOGGER.info("username  is entered");
        return this;
    }

    public Login_page set_password(String password1){
        ActOn.wait(driver,pass).waitForElementToBeVisible();
        ActOn.element(driver, pass).setValue(password1);
        LOGGER.info("password  is entered");
        return this;
    }

    public Login_page click_sign_in(){
        ActOn.wait(driver,click_log_in).waitForElementToBeVisible();
        ActOn.element(driver, click_log_in).click();
        LOGGER.info("sign in button clicked");
        return this;
    }

    public void validate_account_page() {
        ActOn.wait(driver,error_message1).waitForElementToBeVisible();
        String value1 = ActOn.element(driver, error_message1).getTextValue();
        if (value1.equals("Please enter a valid password")) {
            LOGGER.info("Test is passed");
        }else
        {
            LOGGER.info("Test is failed");
        }
    }
}