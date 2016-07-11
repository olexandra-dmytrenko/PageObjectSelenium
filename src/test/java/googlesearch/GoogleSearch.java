package googlesearch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olexandra on 7/11/16.
 */
public class GoogleSearch {
//https://www.youtube.com/watch?v=KCPI5JJNQTI
    private WebDriver firefoxDriver;

    @Before
    public void setUp(){
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        firefoxDriver.get("http://google.com.ua/");

    }

    @After
    public void tearDown(){
        firefoxDriver.close();

    }
    @Test
    public void firstLinkContainsText(){
        //given
        GoogleSearchPage searchPage = new GoogleSearchPage(firefoxDriver);
        //when
        SearchResultPage searchReultPage = searchPage.getResultsForText("Wikipedia");
        //then
        Assert.assertTrue(searchReultPage.getFirstLinkText().contains("wikipedia"));
    }
}
