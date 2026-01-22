package ui_tests;

import dto.User;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.security.PublicKey;

public class LoginTests extends AppManager {
    @Test
    public void loginPositiveTest() {
        System.out.println("first test");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBtnLogin();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.typeLoginRegForm("vil@gmail.com", "Qwerty123!");
        loginPage.clickBtnLoginForm();
    }

    @Test
    public void loginPositiveTestWithUser() {
        User user = new User("vil@gmail.com", "Qwerty123!");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBtnLogin();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.typeLoginRegFormWithUser(user);
        loginPage.clickBtnLoginForm();
    }
}
