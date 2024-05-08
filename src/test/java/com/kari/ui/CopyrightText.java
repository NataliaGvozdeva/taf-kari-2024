package com.kari.ui;

import com.kari.ui.pages.BonusPage;
import com.kari.ui.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CopyrightText extends BaseTest {

    @Test
    @DisplayName("Copyright")
    public void testCopyrightText() {
        HomePage homePage = new HomePage();
        Assertions.assertEquals("©kari. Все права защищены. 2024, контакты, ИООО «КАРИобувь» УНП191778507",homePage.getCopyrightText());

    }

}
