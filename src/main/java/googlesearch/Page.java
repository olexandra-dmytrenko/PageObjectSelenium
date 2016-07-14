package googlesearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Oleksandra_Dmytrenko on 7/11/2016.
 */
class Page {
    WebDriver driver;

    Page(WebDriver driver) {
        init(driver);
    }

    void timeout(int howLong, TimeUnit unit) {
        driver.manage().timeouts().implicitlyWait(howLong, unit);
    }


    protected void init(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    boolean contains(String text) {
        return driver.getPageSource().contains(text);
    }
}
