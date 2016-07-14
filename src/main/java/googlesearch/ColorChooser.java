package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Oleksandra_Dmytrenko on 7/14/2016.
 */
public class ColorChooser {

    //    @FindBy(xpath = ".//*[@type='button' and contains(@style, 'background: #F39C11;')]")
//    @FindBy(xpath = ".//*[@type='button']")
    WebElement colorButton;

    //    @FindBy(xpath = ".//*[contains(@class, 'color-group')]//a/span")
    WebElement itemsAmount;

    ColorChooser(WebElement element) {
        this.colorButton = element.findElement(By.xpath(".//*[@type='button']"));
        this.itemsAmount = element.findElement(By.xpath("//label"));
    }

    public WebElement getColorButton() {
        return colorButton;
    }

    public WebElement getItemsAmount() {
        return itemsAmount;
    }
}
