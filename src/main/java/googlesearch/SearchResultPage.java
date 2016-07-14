package googlesearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by olexandra on 7/11/16.
 */
class SearchResultPage extends Page {

    @FindBy(xpath = "(.//*[@id='rso']//a)[1]")
    private WebElement firstLink;

    SearchResultPage(WebDriver driver) {
        super(driver);
    }

    String getFirstLinkText() {
        return firstLink.getText();
    }
}
