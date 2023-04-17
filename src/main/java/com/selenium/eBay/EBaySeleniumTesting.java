package com.selenium.eBay;

import com.selenium.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBaySeleniumTesting {

    public static final String SEARCH_FIELD = "_nkw";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com/");

        WebElement searchField = driver.findElement(By.name(SEARCH_FIELD));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
