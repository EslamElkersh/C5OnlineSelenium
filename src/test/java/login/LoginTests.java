package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testValidLogin(){
        LoginPage loginPage =homePage.clickFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        var secureAreaPage=loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getMessage().contains("You logged into a secure area!"),
                "You didn't login successfully");
    }
}