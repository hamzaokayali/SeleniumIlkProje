package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/selenium dependencies/drivers/chromedriver.exe");
        WebDriver web = new ChromeDriver();
        web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        web.get("http://a.testaddressbook.com/");
        WebElement signIn = web.findElement(By.id("sign-in"));
        signIn.click();
        WebElement textWelcome = web.findElement(By.tagName("h1"));
        System.out.println(textWelcome.getText());

        //WebElement textWelcome1 = web.findElement(By.xpath("//h1"));



    }
}
