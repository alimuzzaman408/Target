package page_objects;

import command_providers.AssertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sanitizer_Page {
private static final By sanitizer_text=By.xpath("//*[@id='mainContainer']//h1");

    public WebDriver driver;

    public Sanitizer_Page(WebDriver driver){

        this.driver=driver;
    }

    public Sanitizer_Page verify_sanitizer_Page(){
        AssertThat.elementAssertions(driver,sanitizer_text).elementExist();
        return this;
    }


}
