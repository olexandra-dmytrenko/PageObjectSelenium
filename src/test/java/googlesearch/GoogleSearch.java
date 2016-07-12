package googlesearch;

import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olexandra on 7/11/16.
 */
public class GoogleSearch {
//https://www.youtube.com/watch?v=KCPI5JJNQTI
    private static FirefoxDriver firefoxDriver;

    @BeforeClass
    public static void setUp(){
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        firefoxDriver.get("http://google.com.ua/");
    }

    @AfterClass
    public static void tearDown(){
        firefoxDriver.close();
    }

    @Test
    public void firstLinkContainsText(){
        //given
        GoogleSearchPage searchPage = new GoogleSearchPage(firefoxDriver);
        //when
        SearchResultPage searchReultPage = searchPage.getResultsForText("Wikipedia");
        //then
        firefoxDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertTrue(searchReultPage.getFirstLinkText().contains("Вікіпедія"));
    }
}
