package co.uk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{

    public SearchPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "submit")
    private WebElement findProperties;

    @FindBy(id = "radius")
    private WebElement searchRadius;

    @FindBy(xpath = "//select[@id='displayPropertyType']")
    private WebElement propertyType;

    @FindBy(xpath = "//select[@id='minPrice']")
    private WebElement MinPrice;

    @FindBy(xpath = "//select[@id='maxPrice']")
    private WebElement MaxPrice;

    @FindBy(xpath = "//select[@id='minBedrooms']")
    private WebElement MinBed;

    @FindBy(xpath = "//select[@id='maxBedrooms']")
    private WebElement MaxBed;




    public SearchResultPage clickOnFindProperties(){
        waitForElementToBeClickable(findProperties);
        findProperties.click();
        return new SearchResultPage(driver);
    }

    public void selectSearchRadius(String radius){
        selectByVisibleText(searchRadius, radius);
    }

    public void selectPropertyType (String properties){
        selectByVisibleText(propertyType, properties);
    }

    public void  selectMinPrice(String MinRange){
        selectByVisibleText(MinPrice, MinRange);
    }

    public void selectMaxPrice(String MaxRange){
        selectByVisibleText(MaxPrice, MaxRange);
    }

    public void selectMinBed(String MinBedrooms){
        selectByVisibleText(MinBed, MinBedrooms);
    }

    public void selectMaxBed(String MaxBedrooms){
        selectByVisibleText(MaxBed, MaxBedrooms);
    }

}
