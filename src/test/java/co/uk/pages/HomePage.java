package co.uk.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //declare the element
    @FindBy(name = "typeAheadInputField")
    private WebElement searchField;
    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookieButton;

    @FindBy(xpath = "//button[normalize-space()='To Rent']")
    private WebElement forRentButton;

    @FindBy(xpath = "//a[normalize-space()='Buy']")
    private WebElement navBuy;

    @FindBy(xpath = "//a[@class='seo-nav-subNav-link'][normalize-space()='Mortgages']")
    private WebElement navMortgage;

    @FindBy(xpath = "//h1[normalize-space()='Mortgages']")
    private WebElement mortgagePage;

    @FindBy(xpath = "//a[@class='ksc_link button MIPBanner_CallToAction__Button__ISyZN']")
    private WebElement getMortgagePrinciple;


    //perform an action with the element
    public void EnterLocation(String location){
        searchField.clear();
        searchField.sendKeys(location);
    }

    public void acceptCookie(){
        acceptCookieButton.click();
    }

    public SearchPage clickOnForRentButton(){
        forRentButton.click();
        return new SearchPage(driver);
    }

    public void moveToBuy(){
        moveToElement(navBuy);
    }

    public void moveToMortgageAndClick(){
        moveToElementAndClick(navMortgage);
    }
    public void mortgagePageIsDisplayed(){
        Assert.assertTrue(mortgagePage.isDisplayed());
    }

    public void scrollDownPageToGetPrinciple(){
        scrollDownPage(getMortgagePrinciple);
    }

}
