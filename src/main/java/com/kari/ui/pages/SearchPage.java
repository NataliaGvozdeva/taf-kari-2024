package com.kari.ui.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    public SearchPage() {
        this.driver = Driver.getDriver();
    }

    public static final String HEADING_INPUT_XPATH = "//h1";

    public static final String ERROR_MESSAGE_XPATH = "//section[@class='content content_full']/div[1]";
    public String getHeadingText(){return driver.findElement(By.xpath(HEADING_INPUT_XPATH)).getText();}

    public String getErrorText() {
        return driver.findElement(By.xpath(ERROR_MESSAGE_XPATH)).getText();
    }

}
