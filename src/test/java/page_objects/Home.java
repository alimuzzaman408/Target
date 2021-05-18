package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Home {
    private static final By Categories = By.xpath("//span[normalize-space()='Categories']");
    private final By Grocery = By.xpath("//li[@class='NavigationListItem-ljyubl-0 chzHFE']/following::div[text()='Grocery']");
    private final By Dairy = By.xpath("//li[@class='NavigationListItem__BucketListItem-ljyubl-2 gzcTqr']/following::div[text()='Dairy']");
    private final By Milk_item = By.xpath("//div[normalize-space()='Milk']");
    private final By cheese_item = By.xpath(" //div[normalize-space()='Cheese']");
    private final By yogurt_item = By.xpath("  //div[normalize-space()='Yogurt']");
    private final By coffee_creamer_item = By.xpath("//div[normalize-space()='Coffee Creamers']");
    private final By cream_cheese_item = By.xpath("//div[normalize-space()='Cream Cheese']");
    private final By house_hold_item = By.xpath("//div[@class='Row-uds8za-0 glDPjN'][normalize-space()='Household Essentials']");
    private final By Hand_soap_sanitizer_item = By.xpath("//div[normalize-space()='Hand Soap & Sanitizers']");
    private final By hand_soap_item = By.xpath("//div[normalize-space()='Hand Soap']");
    private final By sanitizer_item = By.xpath(" //div[normalize-space()='Hand Sanitizer']");
    private final By toilet_paper_item = By.xpath("//div[normalize-space()='Toilet Paper']");
    private final By Cleaning_supplies_item = By.xpath("//div[normalize-space()='Cleaning Supplies']");
    private final By Cleaning_wipes_item = By.xpath("//div[normalize-space()='Cleaning Wipes']");
    private final By floor_care_item = By.xpath("//div[normalize-space()='Floor Care']");

    private static final Logger LOGGER = LogManager.getLogger(Home.class);

    WebDriver driver;
    public Home(WebDriver driver){
        this.driver=driver;
    }

    public Home click_Categories() throws InterruptedException {
        ActOn.element(driver,Categories).click();
        LOGGER.info("categories item clicked");
        Thread.sleep(500);
        return this;
    }

    public Home clickGrocery() throws InterruptedException {
        ActOn.element(driver,Grocery).click();
        LOGGER.info("Grocery item clicked");
        Thread.sleep(500);
        return this;
    }

    public Home clickDairy() throws InterruptedException {
        ActOn.element(driver,Dairy).click();
        LOGGER.info("Dairy item clicked");
        Thread.sleep(500);
        return this;
    }

    public Home clickMilk(){
        ActOn.element(driver,Milk_item).click();
        LOGGER.info("Milk item clicked");
        return this;
    }

    public Home clickCheese(){
        ActOn.element(driver,cheese_item).click();
        LOGGER.info("Cheese item clicked");
        return this;
    }

    public Home click_Yogurt(){
        ActOn.element(driver,yogurt_item).click();
        LOGGER.info("Yogurt item clicked");
        return this;
    }

    public Home click_coffee_creamer(){
        ActOn.element(driver,coffee_creamer_item).click();
        LOGGER.info("Yogurt item clicked");
        return this;
    }

    public Home click_cream_cheese(){
        ActOn.element(driver,cream_cheese_item).click();
        LOGGER.info("cream_cheese item clicked");
        return this;
    }

    public Home click_house_hold() throws InterruptedException {
        ActOn.element(driver,house_hold_item).click();
        LOGGER.info("household item clicked");
        Thread.sleep(500);
        return this;
    }

    public Home click_Hand_soap_sanitizer_item() throws InterruptedException {
        ActOn.element(driver,Hand_soap_sanitizer_item).click();
        LOGGER.info("Hand_soap_sanitizer_item_clicked");
        Thread.sleep(500);
        return this;
    }

    public Home click_soap(){
        ActOn.element(driver,hand_soap_item).click();
        LOGGER.info("Soap_item clicked");
        return this;
    }

    public Home click_sanitizer(){
        ActOn.element(driver,sanitizer_item).click();
        LOGGER.info("Sanitizer_item clicked");
        return this;
    }

    public Home click_toilet_paper(){
        ActOn.element(driver,toilet_paper_item).click();
        LOGGER.info("toilet_paper_item clicked");
        return this;
    }

    public Home click_cleaning_supplies() throws InterruptedException {
        ActOn.element(driver,Cleaning_supplies_item).click();
        LOGGER.info("Cleaning_supplies_item clicked");
        Thread.sleep(500);
        return this;
    }

    public Home click_cleaning_wipes(){
        ActOn.element(driver,Cleaning_wipes_item).click();
        LOGGER.info("Cleaning_wipes_item clicked");
        return this;
    }

    public Home click_floor_care(){
        ActOn.element(driver,  floor_care_item).click();
        LOGGER.info("  floor_care_item clicked");
        return this;
    }
}
