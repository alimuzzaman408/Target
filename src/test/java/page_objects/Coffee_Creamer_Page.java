package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Coffee_Creamer_Page {
    private static final By coffee_text=By.xpath("//*[@id='mainContainer']//h1");

    private static final Logger LOGGER = LogManager.getLogger(Coffee_Creamer_Page.class);

    public WebDriver driver;

    public Coffee_Creamer_Page(WebDriver driver){
        this.driver=driver;
    }

    public Coffee_Creamer_Page verify_coffee_creamerPage(){
        ActOn.wait(driver,coffee_text).waitForElementToBeVisible();
        String value= ActOn.element(driver,coffee_text).getTextValue();
        Assert.assertEquals("Coffee Creamers",value);
        LOGGER.info("Page is verified with correct text_value");
        return this;
    }
}
