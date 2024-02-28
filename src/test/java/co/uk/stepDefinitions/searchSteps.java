package co.uk.stepDefinitions;

import co.uk.pages.BasePage;
import co.uk.pages.HomePage;
import co.uk.pages.SearchPage;
import co.uk.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class searchSteps extends BasePage {

    //Instantiate an object of the class
    //Or Take a photocopy of the class
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);

    @Given("I  navigate to homepage")
    public void i_navigate_to_homepage() {
    launchUrl();
    }

    @Given("I type the {string} in the search field")
    public void i_type_the_in_the_search_field(String string) {
        homePage.acceptCookie();
        homePage.EnterLocation(string);
    }

    @Given("I click on the Rent button")
    public void i_click_on_the_rent_button() {
        searchPage = homePage.clickOnForRentButton();

    }

    @When("I select {string} in search radius")
    public void i_select_in_search_radius(String radius) {
        searchPage.selectSearchRadius(radius);

    }

    @When("I select {string} as min price")
    public void i_select_as_min_price(String MinRange) {
        searchPage.selectMinPrice(MinRange);
    }

    @When("I select {string} as max price")
    public void i_select_as_max_price(String MaxRange) {
        searchPage.selectMaxPrice(MaxRange);
    }

    @When("I select {string} as min No. of Bedrooms")
    public void i_select_as_min_no_of_bedrooms(String MinBedrooms) {
        searchPage.selectMinBed(MinBedrooms);
    }

    @When("I select {string} as max No. of Bedrooms")
    public void i_select_as_max_no_of_bedrooms(String MaxBedrooms) {
        searchPage.selectMaxBed(MaxBedrooms);
    }

    @When("I select {string} in Property type")
    public void i_select_in_property_type(String properties) {
        searchPage.selectPropertyType(properties);
    }

    @When("I select {string} in Added to site field")
    public void i_select_in_added_to_site_field(String string) throws InterruptedException {
        Thread.sleep(10000);
    }

    @When("I click on Find Properties button")
    public void i_click_on_find_properties_button() {

        searchResultPage = searchPage.clickOnFindProperties();
    }



    @Then("the search result page is displayed")
    public void theSearchResultPageIsDisplayed() {
        searchResultPage.isSearchResultDisplayed();
    }



    @When("I move to Buy")
    public void i_move_to_buy() throws InterruptedException {
        homePage.acceptCookie();
        Thread.sleep(1000);
    homePage.moveToBuy();
    }

    @When("click on Mortgages")
    public void click_on_mortgages() throws InterruptedException {
        Thread.sleep(1000);
    homePage.moveToMortgageAndClick();
        Thread.sleep(1000);
        homePage.scrollDownPageToGetPrinciple();
    }

    @Then("Mortgage screen is displayed")
    public void mortgage_screen_is_displayed() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mortgagePageIsDisplayed();

    }
}