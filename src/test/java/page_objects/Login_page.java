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
    private final By error_message2 = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[text()='Sorry, something went wrong. Please try again.']");


    private static final Logger LOGGER = LogManager.getLogger(Login_page.class);
    WebDriver driver;
    //div[@class='sc-kjoXOD fxsUxV']
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

    public Login_page set_username(String user1) throws InterruptedException {
        ActOn.element(driver, user).setValue(user1);
        Thread.sleep(1000);
        LOGGER.info("username  is entered");
        return this;

    }

    public Login_page set_password(String password1) throws InterruptedException {
        ActOn.element(driver, pass).setValue(password1);
        Thread.sleep(1000);
        LOGGER.info("password  is entered");
        return this;

    }

    public Login_page click_sign_in() throws InterruptedException {
        ActOn.element(driver, click_log_in).click();
        Thread.sleep(1000);
        LOGGER.info("sign in button clicked");
        return this;

    }

    public void validate_account_page() {
        String value1 = ActOn.element(driver, error_message1).getTextValue();
         //String value2 = ActOn.element(driver, error_message2).getTextValue();
        if (value1.equals("Please enter a valid password")) {

            LOGGER.info("Test is passed");

        }else
        {
            LOGGER.info("Test is failed");

        }

    }

}