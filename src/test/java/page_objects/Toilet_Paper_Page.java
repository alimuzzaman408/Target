package page_objects;

import command_providers.AssertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Toilet_Paper_Page {
private static final By toiletPaper_text=By.xpath("//*[@id='mainContainer']//h1");

    public WebDriver driver;

    public Toilet_Paper_Page(WebDriver driver){

        this.driver=driver;
    }

    public Toilet_Paper_Page verify_toilet_paper_Page(){
        AssertThat.elementAssertions(driver,toiletPaper_text).elementExist();
        return this;
    }


}
