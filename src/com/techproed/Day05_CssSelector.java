package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/selenium dependencies/drivers/chromedriver.exe");
        WebDriver web = new ChromeDriver();
        web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        web.get("http://a.testaddressbook.com/");
        WebElement signIn = web.findElement(By.id("sign-in"));
        signIn.click();
        WebElement textBoxEmail = web.findElement(By.cssSelector("input#session_email"));
        textBoxEmail.sendKeys("testtechproed@gmail.com");
        WebElement textBoxPassword = web.findElement(By.cssSelector("input[placeholder='Password']"));
        textBoxPassword.sendKeys("Test1234!");
        textBoxPassword.submit();


    }
}
