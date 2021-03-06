package googlesearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by olexandra on 7/11/16.
 */
//@At(".*/login")
    //https://habrahabr.ru/post/134462/
public class GoogleSearchPage {
    private WebDriver driver;

    @FindBy(id = "lst-ib")
    private WebElement searchField;

    public GoogleSearchPage(WebDriver driver) {
        init(driver);
    }

    public SearchResultPage getResultsForText(String searchText) {
//        searchField = driver.findElement(By.id("lst-ib"));
        searchField.sendKeys(searchText);
        return new SearchResultPage(driver);
    }

    public void init(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
