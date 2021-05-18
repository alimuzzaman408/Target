package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cream_cheese_Page {
private static final By cream_cheese_text=By.xpath("//*[@id='mainContainer']//h1");
    private static final Logger LOGGER = LogManager.getLogger(Cream_cheese_Page.class);

    public WebDriver driver;

    public Cream_cheese_Page(WebDriver driver){
       this.driver=driver;
    }

    public Cream_cheese_Page verify_cheesePage(){
        String value= ActOn.element(driver,cream_cheese_text).getTextValue();
        Assert.assertEquals("Cream Cheese",value);
        LOGGER.info("Page is verified with correct text_value");
        return this;
    }


}
