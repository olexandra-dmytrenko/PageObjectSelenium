package inclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Oleksandra_Dmytrenko on 7/15/2016.
 */
public class Page {
    protected WebDriver driver;

    public Page(WebDriver driver) {
        inti(driver);
    }

    private WebDriver inti(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        return driver;
    }

    void timeout(int howLong, TimeUnit unit) {
        driver.manage().timeouts().implicitlyWait(howLong, unit);
    }
}
