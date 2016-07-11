package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by olexandra on 7/11/16.
 */
public class SearchResultPage extends Page{

    public static final String FIRST_LINK_XPATH = "(.//*[@id='rso']//a)[1]";

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public String getFirstLinkText() {
        return driver.findElement(By.xpath(FIRST_LINK_XPATH)).getText();
    }
}
