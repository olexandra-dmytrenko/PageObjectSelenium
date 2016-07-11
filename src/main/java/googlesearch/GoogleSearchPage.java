package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olexandra on 7/11/16.
 */
public class GoogleSearchPage {
    private final WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultPage getResultsForText(String searchText) {
        WebElement searchfield = driver.findElement(By.id("lst-ib"));
        searchfield.sendKeys(searchText);
        return new SearchResultPage(driver);
    }
}
