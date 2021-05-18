package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Soap_Page {
private static final By soap_text=By.xpath("//*[@id='mainContainer']//h1");

    private static final Logger LOGGER = LogManager.getLogger(Soap_Page.class);

    public WebDriver driver;

    public Soap_Page(WebDriver driver){
        this.driver=driver;
    }

    public Soap_Page verify_soap_Page(){
        ActOn.wait(driver,soap_text).waitForElementToBeVisible();
        String value= ActOn.element(driver,soap_text).getTextValue();
        Assert.assertEquals("Hand Soap",value);
        LOGGER.info("Page is verified with correct text_value");
        return this;
    }
}
