package page_objects;

import command_providers.AssertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cleaning_wipesPage {
private static final By wipes_text=By.xpath("//*[@id='mainContainer']//h1");

    public WebDriver driver;

    public Cleaning_wipesPage(WebDriver driver){
       this.driver=driver;
    }

    public Cleaning_wipesPage validate_page(){
        AssertThat.elementAssertions(driver,wipes_text).elementExist();
        return this;
    }


}
