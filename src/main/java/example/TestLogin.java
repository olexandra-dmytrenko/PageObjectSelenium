package example;

import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: ab83625
 * Date: 10.11.2010
 * To change this template use File | Settings | File Templates.
 */
public class TestLogin extends TestCase {
   public void setUp() {
        // Инициализация контекста.
        Context.initInstance(Context.BROWSER_IE, "https://accounts.google.com/login?hl=ua");
    }

   public void testLoginLogout() {
        String userName = "olexandra.dmytrenko@gmail.com";
        String password = "AchieveTheGoals!";
        LoginPage loginPage = LoginPage.openLoginPage();
        HomePage homePage = loginPage.login(userName, password);
        assertEquals(userName, homePage.getLoggedinUserName());
        homePage.logout();
    }

    public void testInvalidLogin() {
        String userName = "$tester@#";
        String password = "********";
        String expectedMessage = "Invalid username or password";
        LoginPage loginPage = LoginPage.openLoginPage();
        ErrorLoginPage errorLoginPage = loginPage.loginInvalid(userName, password);
        assertEquals(expectedMessage, errorLoginPage.getErrorMessage());
        errorLoginPage.backToLoginPage();
    }

    protected void tearDown() throws Exception {
        // закрытие браузера
       Context.getInstance().close();
    }
}