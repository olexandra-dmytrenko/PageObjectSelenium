package googlesearch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by olexandra on 7/11/16.
 */
public class GoogleSearch {
    //https://www.youtube.com/watch?v=KCPI5JJNQTI
    private WebDriver firefoxDriver;
    private Page page;

    @Before
    public void setUp() {
//        firefoxDriver = (new InternetExplorerDriverSetup()).setupDriver();
//        firefoxDriver = (new SetupDriver(){}).setupDriver();
        firefoxDriver = new FirefoxDriver();
        page = new Page(firefoxDriver);
        page.timeout(2, TimeUnit.SECONDS);
        firefoxDriver.get("http://google.com.ua/");
    }

    @After
    public void tearDown() {
        firefoxDriver.close();

    }

    @Test
    public void firstLinkContainsText() {
        //given
        GoogleSearchPage searchPage = new GoogleSearchPage(firefoxDriver);
        //when
        SearchResultPage searchReultPage = searchPage.getResultsForText("Wikipedia");
        //then
        page.timeout(2, TimeUnit.SECONDS);
        Assert.assertTrue(searchReultPage.getFirstLinkText().contains("Вікіпедія"));
    }

    @Test
    public void pressOnLinkWithText() {
        //given
        GoogleSearchPage searchPage = new GoogleSearchPage(firefoxDriver);
        //when
        SearchResultPage searchReultPage = searchPage.getResultsForText("automationpractice");
        //then
        page.timeout(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(firefoxDriver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Practice")));
        Assert.assertTrue(searchReultPage.contains("Automation Practice"));
        searchReultPage.pressOnLinkWithText("Automation Practice");

        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("DRESSES")));
        searchReultPage.pressOnLinkWithText("DRESSES");
        DressesPage dressesPage = new DressesPage(firefoxDriver);
        dressesPage.outputColorElements();
//        String amount = dressesPage.seeFirstColorItemText();
        System.out.println(dressesPage.seeFirstColorItemText(2));
    }
}
