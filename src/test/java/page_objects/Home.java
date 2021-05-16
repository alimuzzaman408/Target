package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    private static final By Categories= By.xpath("//span[normalize-space()='Categories']");
    private final By Grocery = By.xpath("//li[@class='NavigationListItem-ljyubl-0 chzHFE']/following::div[text()='Grocery']");
    private final By Dairy=By.xpath("//li[@class='NavigationListItem__BucketListItem-ljyubl-2 gzcTqr']/following::div[text()='Dairy']");
    private final By Milk_item=By.xpath("//*[@id='5xszh']/a/div");
    private final By cheese_item=By.xpath(" //div[normalize-space()='Cheese']");
    private final By yogurt_item=By.xpath("  //div[normalize-space()='Yogurt']");
    private final By coffee_creamer_item=By.xpath("//div[normalize-space()='Coffee Creamers']");
    private final By cream_cheese_item=By.xpath("//div[normalize-space()='Cream Cheese']");
    private final By house_hold_item=By.xpath("//*[@id='5xsz1']/a/div");
    private final By Hand_soap_sanitizer_item=By.xpath("//div[normalize-space()='Hand Soap & Sanitizers']");
    private final By hand_soap_item=By.xpath("//div[normalize-space()='Hand Soap']");
    private final By sanitizer_item=By.xpath(" //div[normalize-space()='Hand Sanitizer']");
    private static final By text_value=By.xpath("//*[@id='mainContainer']//h1");

    private final By toilet_paper_item=By.xpath(" //*[@id='5xsyk']/a/div[text()='Toilet Paper']");


    private final By Cleaning_supplies_item=By.xpath(" //*[@id='5xsyy']/a/div[text()='Cleaning Supplies']");

    private final By Cleaning_wipes_item=By.xpath(" //*[@id='4tgy2']/a/div[text()='Cleaning Wipes']");

    private final By floor_care_item=By.xpath("//*[@id='5xsyt']/a/div[text()='Floor Care']");



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

    public Home clickMilk() throws InterruptedException {
        ActOn.element(driver,Milk_item).click();
        LOGGER.info("Milk item clicked");
        Thread.sleep(1000);
        return this;
    }

    public Home clickCheese() throws InterruptedException {
        ActOn.element(driver,cheese_item).click();
        LOGGER.info("Cheese item clicked");
        Thread.sleep(1000);
        return this;
    }

    public Home click_Yogurt() throws InterruptedException {
        ActOn.element(driver,yogurt_item).click();
        LOGGER.info("Yogurt item clicked");
        Thread.sleep(1000);
        return this;
    }

    public Home click_coffee_creamer() throws InterruptedException {
        ActOn.element(driver,coffee_creamer_item).click();
        LOGGER.info("Yogurt item clicked");
        Thread.sleep(1000);
        return this;
    }

    public Home click_cream_cheese() throws InterruptedException {
        ActOn.element(driver,cream_cheese_item).click();
        LOGGER.info("cream_cheese item clicked");
        Thread.sleep(1000);
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

    public Home click_soap() throws InterruptedException {
        ActOn.element(driver,hand_soap_item).click();
        LOGGER.info("Soap_item clicked");
        Thread.sleep(2000);
        return this;
    }

    public Home click_sanitizer() throws InterruptedException {
        ActOn.element(driver,sanitizer_item).click();
        LOGGER.info("Sanitizer_item clicked");
        Thread.sleep(2000);
        return this;
    }

    public Home click_toilet_paper() throws InterruptedException {
        ActOn.element(driver,toilet_paper_item).click();
        LOGGER.info("toilet_paper_item clicked");
        Thread.sleep(2000);
        return this;
    }

    public Home click_cleaning_supplies() throws InterruptedException {
        ActOn.element(driver,Cleaning_supplies_item).click();
        LOGGER.info("Cleaning_supplies_item clicked");
        Thread.sleep(500);
        return this;


    }

    public Home click_cleaning_wipes() throws InterruptedException {
        ActOn.element(driver,Cleaning_wipes_item).click();
        LOGGER.info("Cleaning_wipes_item clicked");
        Thread.sleep(2000);
        return this;


    }
    public Home click_floor_care() throws InterruptedException {
        ActOn.element(driver,  floor_care_item).click();
        LOGGER.info("  floor_care_item clicked");
        Thread.sleep(2000);
        return this;


    }

    public Home validate_Page(){
        AssertThat.elementAssertions(driver,text_value).elementExist();
        return this;
    }





}
