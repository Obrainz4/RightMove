package co.uk.hooks;

import co.uk.commons.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserFactory {

    @Before
    public void setUp(){
        launchBrowser("Chrome");
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
