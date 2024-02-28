package co.uk.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static java.time.Duration.*;


public class BrowserFactory extends DriverFactory{

    private WebDriver launchChrome(){

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private WebDriver launchFirefox(){

        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private WebDriver launchEdge () {

        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    private WebDriver launchHeadlessChrome(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu","--headless");

        return new ChromeDriver(options);

    }

    public void launchBrowser(String browser){
        if (browser.equals("Chrome")) {
            driver = launchChrome();
        } else if (browser.equals("Firefox")) {
            driver = launchFirefox();
        } else if (browser.equals("Edge")) {
            driver = launchEdge();
        } else if (browser.equals("HeadlessChrome")) {
            driver = launchHeadlessChrome();
        } else {
            driver = launchEdge();
        }

        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(ofSeconds(30));
        driver.manage().window().maximize();

    }

    public void closeBrowser(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }


}
