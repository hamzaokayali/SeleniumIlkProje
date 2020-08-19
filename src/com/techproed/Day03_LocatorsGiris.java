package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        webDriver.manage().window().maximize();
        webDriver.get("http://a.testaddressbook.com");

        WebElement signIn = webDriver.findElement(By.id("sign-in"));
        signIn.click();

        WebElement textBoxEmail =webDriver.findElement(By.id("session_email"));
        textBoxEmail.sendKeys("testtechproed@gmail.com");

        WebElement textBoxPassword = webDriver.findElement(By.id("session_password"));
        textBoxPassword.sendKeys("Test1234!");

        WebElement commitButton = webDriver.findElement(By.name("commit"));
        commitButton.click();

        String sayfaTitle = webDriver.getTitle();
        if (sayfaTitle.equals("Address Book"))
            System.out.println("Giriş Başarılı");
        else
            System.out.println("giriş başarılamadı");



       // <input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">



    }
}
