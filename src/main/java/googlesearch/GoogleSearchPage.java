package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by olexandra on 7/11/16.
 */
public class GoogleSearchPage extends Page{

    public static final String SEARCH_FIELD_ID = "lst-ib";

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage getResultsForText(String searchText) {
        WebElement searchField = driver.findElement(By.id(SEARCH_FIELD_ID));
        searchField.sendKeys(searchText);
        return new SearchResultPage(driver);
    }
}
