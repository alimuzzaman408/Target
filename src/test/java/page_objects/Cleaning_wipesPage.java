package page_objects;

import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cleaning_wipesPage {
private static final By wipes_text=By.xpath("//*[@id='mainContainer']//h1");
    private static final Logger LOGGER = LogManager.getLogger(Cleaning_wipesPage.class);


    public WebDriver driver;

    public Cleaning_wipesPage(WebDriver driver){
       this.driver=driver;
    }

    public Cleaning_wipesPage validate_page(){
        AssertThat.elementAssertions(driver,wipes_text).elementExist();
        LOGGER.info("Page is validated");
        return this;
    }


}
