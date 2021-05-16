package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Floor_Care {
    private static final By floor_text=By.xpath("//*[@id='mainContainer']//h1");
    private static final By check_box=By.xpath("//*[@id='mainContainer']/descendant::div[@class='styles__CheckboxVisual-sc-1v63imw-5 gxIeGa'][1]");

    public WebDriver driver;

    public Floor_Care(WebDriver driver){

        this.driver=driver;
    }
    public Floor_Care validate_page(){
        AssertThat.elementAssertions(driver,floor_text).elementExist();
        return this;
    }

    public Floor_Care click_check_box() throws InterruptedException {
        ActOn.element(driver,check_box).click();
        Thread.sleep(10000);
        return this;
    }



}
