package inclass;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Oleksandra_Dmytrenko on 7/15/2016.
 */
public class FindInGoogle {
    public static final String GOOGLE_LINK = "http://google.com.ua/";
    WebDriver driver;
    private GooglePage googlePage;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get(GOOGLE_LINK);
        googlePage = new GooglePage(driver);
    }

    @Test
    public void findFirstLink() {
        ResultPage resultPage = googlePage.searchText("automationpractice");
        Assert.assertEquals("Automation Practice", resultPage.getFirstLinkText());
    }

    @After
    public void tearDown() {
        driver.close();
    }

}
