package inclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Oleksandra_Dmytrenko on 7/15/2016.
 */
public class ResultPage extends Page{

    @FindBy(xpath = "(.//*[@id='rso']//a)[1]")
    private WebElement firstLink;

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public String getFirstLinkText() {
        return firstLink.getText();
    }
}
