package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Oleksandra_Dmytrenko on 7/14/2016.
 */
public class ChromeDriverSetup implements SetupDriver {
    @Override
    public WebDriver setupDriver() {
        return new ChromeDriver();
    }
}
