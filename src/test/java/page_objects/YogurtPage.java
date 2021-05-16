package page_objects;

import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YogurtPage {
private static final By yogurt_text=By.xpath("//*[@id='mainContainer']//h1");
    private static final Logger LOGGER = LogManager.getLogger(Sanitizer_Page.class);

    public WebDriver driver;

    public YogurtPage(WebDriver driver){

        this.driver=driver;
    }

    public YogurtPage verify_yogurtPage(){
        AssertThat.elementAssertions(driver,yogurt_text).elementExist();
        LOGGER.info("Page is validated");
        return this;
    }


}
