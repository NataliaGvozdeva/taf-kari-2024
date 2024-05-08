package com.kari.ui.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BonusPage {
    WebDriver driver;
    public BonusPage() {
        this.driver = Driver.getDriver();
    }

    public static final String HEADING_XPATH ="//h1";

    public String getHeadingText() {
        return driver.findElement(By.xpath(HEADING_XPATH)).getText();
    }
}
