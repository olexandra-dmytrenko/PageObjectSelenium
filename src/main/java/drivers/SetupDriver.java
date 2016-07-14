package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Oleksandra_Dmytrenko on 7/14/2016.
 */
interface SetupDriver {

    default WebDriver setupDriver() {
        return new FirefoxDriver();
    }
}
