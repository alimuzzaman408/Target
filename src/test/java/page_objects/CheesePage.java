package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheesePage {
private static final By cheese_text=By.xpath("//*[@id='mainContainer']//h1");

    private static final Logger LOGGER = LogManager.getLogger(CheesePage.class);

    public WebDriver driver;

    public CheesePage(WebDriver driver){
       this.driver=driver;
    }

    public CheesePage verify_cheesePage(){
        ActOn.wait(driver,cheese_text).waitForElementToBeVisible();
        String value= ActOn.element(driver,cheese_text).getTextValue();
        Assert.assertEquals("Cheese",value);
        LOGGER.info("Page is verified with correct text_value");
        return this;
    }
}
