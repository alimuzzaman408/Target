package page_objects;

import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sanitizer_Page {
private static final By sanitizer_text=By.xpath("//*[@id='mainContainer']//h1");
    private static final Logger LOGGER = LogManager.getLogger(Sanitizer_Page.class);

    public WebDriver driver;

    public Sanitizer_Page(WebDriver driver){

        this.driver=driver;
    }

    public Sanitizer_Page verify_sanitizer_Page(){
        AssertThat.elementAssertions(driver,sanitizer_text).elementExist();
        LOGGER.info("Page is validated");
        return this;
    }


}
