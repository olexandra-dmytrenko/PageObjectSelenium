package inclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

/**
 * Created by Oleksandra_Dmytrenko on 7/15/2016.
 */
public class GooglePage extends Page{

    @FindBy(how = How.ID, using = "lst-ib")
    @CacheLookup
    private WebElement searchField;

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public ResultPage searchText(String text) {
        searchField.sendKeys(text);
        searchField.submit();
        timeout(2, TimeUnit.SECONDS);
        return new ResultPage(driver);
    }

}
