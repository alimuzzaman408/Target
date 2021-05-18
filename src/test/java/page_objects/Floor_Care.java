package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Floor_Care {
    private static final By floor_text=By.xpath("//*[@id='mainContainer']//h1");
    private static final By check_box=By.xpath("//*[@id='mainContainer']/descendant::div[@class='styles__CheckboxVisual-sc-1v63imw-5 gxIeGa'][1]");
    private static final Logger LOGGER = LogManager.getLogger(Floor_Care.class);
    public WebDriver driver;

    public Floor_Care(WebDriver driver){

        this.driver=driver;
    }
    public Floor_Care validate_page(){
        ActOn.wait(driver,floor_text).waitForElementToBeVisible();
        String value= ActOn.element(driver,floor_text).getTextValue();
        Assert.assertEquals("Floor Care",value);
        LOGGER.info("Page is verified with correct text_value");
        return this;
    }

    public Floor_Care click_check_box() throws InterruptedException {
        ActOn.wait(driver,check_box).waitForElementToBeVisible();
        ActOn.element(driver,check_box).click();
        //Thread.sleep(10000);
        LOGGER.info("Check box clicked");
        return this;
    }



}
