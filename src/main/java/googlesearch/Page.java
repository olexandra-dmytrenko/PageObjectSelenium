package googlesearch;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Oleksandra_Dmytrenko on 7/11/2016.
 */
public class Page {
    protected WebDriver driver;

    public Page(WebDriver driver) {
        init(driver);
    }

    public void timeout(int howLong, TimeUnit unit) {
        driver.manage().timeouts().implicitlyWait(howLong, unit);
    }


    public void init(final WebDriver driver) {
        this.driver = driver;
    }
}
