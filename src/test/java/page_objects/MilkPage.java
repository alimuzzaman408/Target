package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MilkPage {
private static final By milk_text=By.xpath("//*[@id='mainContainer']//h1");

    public WebDriver driver;

    public MilkPage(WebDriver driver){
       this.driver=driver;
    }

    public MilkPage verify_milkPage(){
        AssertThat.elementAssertions(driver,milk_text).elementExist();
        return this;
    }


}
