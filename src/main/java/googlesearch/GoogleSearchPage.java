package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by olexandra on 7/11/16.
 */
public class GoogleSearchPage {
    private WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        init(driver);
    }

    public SearchResultPage getResultsForText(String searchText) {
        WebElement searchField = driver.findElement(By.id("lst-ib"));
        searchField.sendKeys(searchText);
        return new SearchResultPage(driver);
    }

    public void init(final WebDriver driver) {
        this.driver = driver;
    }
}
