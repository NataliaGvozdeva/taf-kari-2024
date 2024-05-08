package com.kari.ui;

import com.kari.ui.pages.BonusPage;
import com.kari.ui.pages.HomePage;
import com.kari.ui.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BonusTest extends BaseTest {

    @Test
    @DisplayName("Bonus program")
    public void testBonusHeadingText() {
        HomePage homePage = new HomePage();
        BonusPage bonusPage = new BonusPage();
        homePage.pressBonusProgram();
        Assertions.assertEquals("БОНУСНАЯ ПРОГРАММА \"KARI CLUB\"",bonusPage.getHeadingText());

    }

}
