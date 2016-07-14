package googlesearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Oleksandra_Dmytrenko on 7/14/2016.
 */
public class DressesPage extends Page {

    @FindBy(xpath = ".//*[contains(@class, 'color-group')]/li")
    List<WebElement> colorChooserList;
//    List<ColorChooser> colorChooserList;

    DressesPage(WebDriver driver) {
        super(driver);
    }

    public String seeFirstColorItemText(int index) {
        return (new ColorChooser(colorChooserList.get(index))).getItemsAmount().getText();
    }

    void outputColorElements() {
        colorChooserList.stream().map(WebElement::getText).forEach(System.out::println);
    }

}
