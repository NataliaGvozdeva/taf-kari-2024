package com.kari.ui;

import com.kari.ui.pages.HomePage;
import com.kari.ui.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Candidate login with empty Password field")
    public void testLoginWithEmptyPassword() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.clickSignInBtn();
        Assertions.assertEquals("ВХОД ДЛЯ ЗАРЕГИСТРИРОВАННЫХ",loginPage.getHeadingText());
        loginPage.clickButtonInput();
        Assertions.assertEquals("Неверный логин или пароль.",loginPage.getErrorText());
    }

}
