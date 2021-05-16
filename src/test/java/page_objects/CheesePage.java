package page_objects;

import command_providers.AssertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheesePage {
private static final By cheese_text=By.xpath("//*[@id='mainContainer']//h1");

    public WebDriver driver;

    public CheesePage(WebDriver driver){
       this.driver=driver;
    }

    public CheesePage verify_cheesePage(){
        AssertThat.elementAssertions(driver,cheese_text).elementExist();
        return this;
    }


}
