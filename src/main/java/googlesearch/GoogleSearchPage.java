package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by olexandra on 7/11/16.
 */
class GoogleSearchPage extends Page{

//    private static final String SEARCH_FIELD_ID = "lst-ib";
    private static final By SEARCH_FIELD_ID = By.id("lst-ib");

    GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    SearchResultPage getResultsForText(String searchText) {
        WebElement searchField = driver.findElement(SEARCH_FIELD_ID);
        searchField.sendKeys(searchText);
        return new SearchResultPage(driver);
    }
}
