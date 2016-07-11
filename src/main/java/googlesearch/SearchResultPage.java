package googlesearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by olexandra on 7/11/16.
 */
public class SearchResultPage extends Page {

    @FindBy(xpath = "(.//*[@id='rso']//a)[1]")
    private WebElement firstLink;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public String getFirstLinkText() {
        return firstLink.getText();
    }
}
