package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver web = new ChromeDriver();
        web.get("https://www.google.com");
        String sayfaTitle = web.getTitle();
        String sayfaUrl = web.getCurrentUrl();

        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);

    }
}
