package co.uk.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//i[@class='searchTitle-saveSearchNoFrequencyLabel searchTitle-saveSearchNoFrequencyLabel--dark']")
    private WebElement pageDescription;


    public void isSearchResultDisplayed(){
        Assert.assertTrue(pageDescription.isDisplayed());
    }

}
