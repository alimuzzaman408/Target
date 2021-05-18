package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MilkPage {
    private static final By milk_text=By.xpath("//*[@id='mainContainer']//h1");

    private static final Logger LOGGER = LogManager.getLogger(MilkPage.class);

    public WebDriver driver;

    public MilkPage(WebDriver driver){
       this.driver=driver;
    }

    public MilkPage verify_milkPage(){
       ActOn.wait(driver,milk_text).waitForElementToBeVisible();
       String value=ActOn.element(driver,milk_text).getTextValue();
       Assert.assertEquals("Milk",value);
       LOGGER.info("Page is verified with correct text_value");
        return this;
    }
}
