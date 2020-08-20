package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorrsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/selenium dependencies/drivers/chromedriver.exe");
        WebDriver web = new ChromeDriver();
        web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        web.get("http://a.testaddressbook.com/");
        WebElement signInLink = web.findElement(By.id("sign-in"));
        signInLink.click();
        WebElement emailKutusu = web.findElement(By.className("form-control"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        WebElement sifreKutusu = web.findElement(By.className("form-control"));
        sifreKutusu.sendKeys("Test1234!");

    }
}
