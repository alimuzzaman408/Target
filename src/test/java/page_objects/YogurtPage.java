package page_objects;

import command_providers.AssertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YogurtPage {
private static final By yogurt_text=By.xpath("//*[@id='mainContainer']//h1");

    public WebDriver driver;

    public YogurtPage(WebDriver driver){

        this.driver=driver;
    }

    public YogurtPage verify_yogurtPage(){
        AssertThat.elementAssertions(driver,yogurt_text).elementExist();
        return this;
    }


}
