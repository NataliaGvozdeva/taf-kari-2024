package com.kari.ui;

import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    WebDriver driver;

    public static final String CHOOSE_CITY_XPATH = "//button[text()='Да, верно']";
    public void chooseCity() {
        driver.findElement(By.xpath(CHOOSE_CITY_XPATH)).click();
    }

    @BeforeEach
    public void warmUp() {
        driver = Driver.getDriver();
        driver.get("https://by.kari.com/by/");
        chooseCity();
    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}
