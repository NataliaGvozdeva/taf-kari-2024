package com.kari.ui.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;

public class HomePage {

    WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public static final String SIGN_IN_XPATH = "//span[@id='sale_basket_header']/a[@href='/by/cabinet/']";
    //public static final String SEARCH_FIELD_XPATH = "//form[@class='aero_m_search aero_m_hidden-lg-up aero_m_hidden-sm-down']";
    public static final String SEARCH_FIELD_XPATH = "//form[@class='aero_m_search aero_m_hidden-lg-up aero_m_hidden-sm-down']/input[@class='aero_m_form-control']";
    public static final String SEARCH_FIELD_XPATH1 = "//form[@class='aero_m_search aero_m_hidden-lg-up aero_m_hidden-sm-down']/input";
    public static final String SEARCH_BUTTON_XPATH = "//button[@class='aero_m_btn aero_m_btn-blank']";
    public static final String BONUS_XPATH = "//span[@class='aero_m_h6']";
    public static final String COPYRIGHT_XPATH = "//div[@class='aero_m_span']";

    private final By SEARCH_FIELD_NAME = By.name("ПОИСК ПО");

    public void clickSignInBtn() {
        driver.findElement(By.xpath(SIGN_IN_XPATH)).click();
    }

    public void pressSearchButton(){
         driver.findElement(By.xpath(SEARCH_BUTTON_XPATH)).click();
    }

    public void pressBonusProgram(){
        driver.findElement(By.xpath(BONUS_XPATH)).click();
    }

    public String getCopyrightText() {
        return driver.findElement(By.xpath(COPYRIGHT_XPATH)).getText();
    }
}