package page_objects;

import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
        AssertThat.elementAssertions(driver,coffee_text).elementExist();
        LOGGER.info("Page is validated");
        return this;

    }


}
