package com.kari.ui;

import com.kari.ui.pages.HomePage;
import com.kari.ui.pages.LoginPage;
import com.kari.ui.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest  {

    @Test
    @DisplayName("Search field")
    public void testEmptySearch() {
        HomePage homePage = new HomePage();
        SearchPage searchPage = new SearchPage();
        homePage.pressSearchButton();
        Assertions.assertEquals("РЕЗУЛЬТАТ ПОИСКА",searchPage.getHeadingText());
        Assertions.assertEquals("Сожалеем, ничего не найдено",searchPage.getErrorText());
    }
}
