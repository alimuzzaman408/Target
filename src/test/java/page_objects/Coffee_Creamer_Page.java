package page_objects;

import command_providers.AssertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Coffee_Creamer_Page {
private static final By coffee_text=By.xpath("//*[@id='mainContainer']//h1");

    public WebDriver driver;

    public Coffee_Creamer_Page(WebDriver driver){

        this.driver=driver;
    }

    public Coffee_Creamer_Page verify_coffee_creamerPage(){
        AssertThat.elementAssertions(driver,coffee_text).elementExist();
        return this;
    }


}
