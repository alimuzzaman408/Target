package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Toilet_Paper_Page {
    private static final By toiletPaper_text=By.xpath("//*[@id='mainContainer']//h1");

    private static final Logger LOGGER = LogManager.getLogger(Toilet_Paper_Page.class);

    public WebDriver driver;

    public Toilet_Paper_Page(WebDriver driver){
        this.driver=driver;
    }

    public Toilet_Paper_Page verify_toilet_paper_Page(){
        ActOn.wait(driver,toiletPaper_text).waitForElementToBeVisible();
        String value= ActOn.element(driver,toiletPaper_text).getTextValue();
        Assert.assertEquals("Toilet Paper",value);
        LOGGER.info("Page is verified with correct text_value");
        return this;
    }
}
