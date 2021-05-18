package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YogurtPage {
    private static final By yogurt_text=By.xpath("//*[@id='mainContainer']//h1");

    private static final Logger LOGGER = LogManager.getLogger(YogurtPage.class);

    public WebDriver driver;

    public YogurtPage(WebDriver driver){
        this.driver=driver;
    }

    public YogurtPage verify_yogurtPage(){
        ActOn.wait(driver,yogurt_text).waitForElementToBeVisible();
        String value= ActOn.element(driver,yogurt_text).getTextValue();
        Assert.assertEquals("Yogurt",value);
        LOGGER.info("Page is verified with correct text_value");
        return this;
    }
}
