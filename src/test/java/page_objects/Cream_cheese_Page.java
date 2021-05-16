package page_objects;

import command_providers.AssertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cream_cheese_Page {
private static final By cream_cheese_text=By.xpath("//*[@id='mainContainer']//h1");

    public WebDriver driver;

    public Cream_cheese_Page(WebDriver driver){
       this.driver=driver;
    }

    public Cream_cheese_Page verify_cheesePage(){
        AssertThat.elementAssertions(driver,cream_cheese_text).elementExist();
        return this;
    }


}
