package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/selenium dependencies/drivers/chromedriver.exe");
        WebDriver web = new ChromeDriver();
        web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        web.get("https://www.google.com/");
        WebElement textBox = web.findElement(By.name("q"));
        textBox.sendKeys("city bike");
        textBox.submit();
        WebElement soSa = web.findElement(By.id("result-stats"));
        soSa.getText();
        WebElement avL = web.findElement(By.partialLinkText("Alışveriş"));
        avL.click();
    }
}
