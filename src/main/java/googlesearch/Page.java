package googlesearch;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Oleksandra_Dmytrenko on 7/11/2016.
 */
public class Page {
    private static WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void timeout(int howLong, TimeUnit unit) {
        driver.manage().timeouts().implicitlyWait(howLong, unit);
    }


}
