package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsTagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/selenium dependencies/drivers/chromedriver.exe");
        WebDriver web = new ChromeDriver();
        web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        web.get("http://a.testaddressbook.com/");

        WebElement homeLinki = web.findElement(By.tagName("a"));
        homeLinki.click();
        System.out.println(homeLinki.getText());
    }
}
