package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by olexandra on 7/11/16.
 */
public class SearchResultPage {
    private final WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstLinkText() {
        return driver.findElement(By.xpath("(.//*[@id='rso']//a)[1]")).getText();
    }
}
