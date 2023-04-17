package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumTesting {

    private static final String CHROME_DRIVER = "CHROME_DRIVER";
    private static final String SEARCH_FIELD = "q";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(CHROME_DRIVER);
        driver.get("https://www.google.com/");

        WebElement acceptCookies = driver.findElement(By.id("L2AGLb"));
        acceptCookies.click();

        WebElement searchField = driver.findElement(By.name(SEARCH_FIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();

    }
}
