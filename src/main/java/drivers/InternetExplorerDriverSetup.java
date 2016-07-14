package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Oleksandra_Dmytrenko on 7/14/2016.
 */
public class InternetExplorerDriverSetup implements SetupDriver {
    @Override
    public WebDriver setupDriver() {
        return new InternetExplorerDriver();
    }
}
