package page_objects;

import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
        AssertThat.elementAssertions(driver,cheese_text).elementExist();
        LOGGER.info("Page is validated");
        return this;
    }


}
