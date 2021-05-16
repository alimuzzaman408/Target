package step_definition;

import command_providers.ActOn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.*;
import utilities.ReadConfigFiles;


public class Steps {

     WebDriver driver=Hooks.driver;
    @Given("^Customer on the home page$")
    public void navigateToHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("url"));

    }

    @When("^Navigate to milk page from categories$")
    public void navigateMilkPage() throws InterruptedException {
        new Home(driver)
                .click_Categories()
                .clickGrocery()
                .clickDairy()
                .clickMilk();
    }
    @Then("^Customer will be on Milk Page$")
    public void validate_milkPage() {

        new MilkPage(driver).verify_milkPage();
    }


    @When("^Navigate to cheese page from categories$")
    public void navigate_cheese() throws InterruptedException {

        new Home(driver)
                .click_Categories()
                .clickGrocery()
                .clickDairy()
                .clickCheese();
    }
    @Then("^Customer will be on cheese Page$")
    public void validate_cheese() {

        new CheesePage(driver).verify_cheesePage();
        }


    @When("^Navigate to yogurt page from categories$")
    public void navigate_yogurtPage() throws InterruptedException {
       new Home(driver)
               .click_Categories()
               .clickGrocery()
               .clickDairy()
               .click_Yogurt();
    }
    @Then("^Customer will be on yogurt Page$")
    public void validate_yogurt() {
        new YogurtPage(driver)
                .verify_yogurtPage();
    }

   @When("^Navigate to coffee_creamer page from categories$")
    public void navigate_to_coffee_creamer_page_from_categories() throws InterruptedException {

        new Home(driver)
                .click_Categories()
                .clickGrocery()
                .clickDairy()
                .click_coffee_creamer();
    }

    @Then("^Customer will be on coffee_creamer Page$")
    public void customer_will_be_on_coffee_creamer_page() {
        new Coffee_Creamer_Page(driver)
                .verify_coffee_creamerPage();
    }

    @When("^Navigate to Cream_cheese page from categories$")
    public void navigate_to_cream_cheese_page_from_categories() throws InterruptedException {

        new Home(driver)
                .click_Categories()
                .clickGrocery()
                .clickDairy()
                .click_cream_cheese();
    }

    @Then("^Customer will be on Cream_cheese Page$")
    public void customer_will_be_on_cream_cheese_page() {
        new Cream_cheese_Page(driver)
                .verify_cheesePage();
    }

     @When("^Navigate to soap page from categories$")
    public void navigate_to_soap_page_from_categories() throws InterruptedException {
        new Home(driver)
                .click_Categories()
                .click_house_hold()
                .click_Hand_soap_sanitizer_item()
                .click_soap();
    }

    @Then("^Customer will be on soap Page$")
    public void customer_will_be_on_soap_page() {
        new Soap_Page(driver)
                .verify_soap_Page();

    }

    @When("^Navigate to sanitizer page from categories$")
    public void navigate_to_sanitizer_page_from_categories() throws InterruptedException {
        new Home(driver)
                .click_Categories()
                .click_house_hold()
                .click_Hand_soap_sanitizer_item()
                .click_sanitizer();
    }

    @Then("^Customer will be on sanitizer Page$")
    public void customer_will_be_on_sanitizer_page() {
        new Sanitizer_Page(driver)
                .verify_sanitizer_Page();

    }

   @When("^Navigate to toilet_paper page from categories$")
    public void navigate_to_toilet_paper_page_from_categories() throws InterruptedException {
        new Home(driver)
                .click_Categories()
                .click_house_hold()
                .click_toilet_paper();

    }

    @Then("^Customer will be on toilet_paper Page$")
    public void customer_will_be_on_toilet_paper_page() {
        new Toilet_Paper_Page(driver)
                .verify_toilet_paper_Page();

    }

    @When("^Navigate to cleaning_wipes page from categories$")
    public void navigate_to_cleaning_supplies_page_from_categories() throws InterruptedException {
        new Home(driver)
                .click_Categories()
                .click_house_hold()
                .click_cleaning_supplies()
                .click_cleaning_wipes();

    }

    @Then("^Customer will be on cleaning_wipes Page$")
    public void customer_will_be_on_cleaning_wipes_page() {
        new Cleaning_wipesPage(driver)
                .validate_page();






    }

    @When("^Navigate to floor_care page from categories$")
    public void navigate_to_floor_care_page_from_categories() throws InterruptedException {
        new Home(driver)
                .click_Categories()
                .click_house_hold()
                .click_cleaning_supplies()
                .click_floor_care();

    }

    @Then("^Customer will be on floor_care Page$")
    public void customer_will_be_on_floor_care_page() throws InterruptedException {

       new Floor_Care(driver)
               .validate_page()
               .click_check_box();

    }



    @When("^user click sign_in from menu button$")
    public void user_click_sign_in_from_menu_button() {

    }

    @When("^enter <username> and <password>$")
    public void enter_username_and_password() {

    }

    @When("^click sign in$")
    public void click_sign_in() {

    }

    @Then("^user should be on account page$")
    public void user_should_be_on_account_page() {

    }


    }
