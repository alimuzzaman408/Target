package page_objects;

import command_providers.AssertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Soap_Page {
private static final By soap_text=By.xpath("//*[@id='mainContainer']//h1");

    public WebDriver driver;

    public Soap_Page(WebDriver driver){

        this.driver=driver;
    }

    public Soap_Page verify_soap_Page(){
        AssertThat.elementAssertions(driver,soap_text).elementExist();
        return this;
    }


}
