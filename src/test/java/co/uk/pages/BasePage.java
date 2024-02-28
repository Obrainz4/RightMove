package co.uk.pages;

import co.uk.commons.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.*;

public class BasePage extends DriverFactory {

    public String Base_URL = "https://www.rightmove.co.uk/";

    public void launchUrl(){
        driver.navigate().to(Base_URL);
    }

    public void selectByVisibleText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);

    }

    public void SelectByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);

    }

    public void selectByIndex(WebElement element, int index){
        select = new Select(element);
        select.selectByIndex(index);
    }

    public void waitForElementToBeClickable(WebElement element){
        wait = new WebDriverWait(driver, ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void moveToElement(WebElement element){
        actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void moveToElementAndClick(WebElement element) {
        actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    public void scrollDownPage(WebElement element) {
        actions = new Actions(driver);
        actions.scrollToElement(element).build().perform();
    }



}
