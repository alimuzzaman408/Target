package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Soap_Page {
private static final By soap_text=By.xpath("//*[@id='mainContainer']//h1");
    private static final Logger LOGGER = LogManager.getLogger(Sanitizer_Page.class);

    public WebDriver driver;

    public Soap_Page(WebDriver driver){

        this.driver=driver;
    }

    public Soap_Page verify_soap_Page(){
        String value= ActOn.element(driver,soap_text).getTextValue();
        Assert.assertEquals("Hand Soap",value);
        LOGGER.info("Page is verified with correct text_value");
        return this;
    }


}
