package com.kari.ui.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {

    WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public static final String SIGN_IN_XPATH = "//span[@id='sale_basket_header']/a[@href='/by/cabinet/']";
    public void clickSignInBtn() {
        driver.findElement(By.xpath(SIGN_IN_XPATH)).click();
    }

}