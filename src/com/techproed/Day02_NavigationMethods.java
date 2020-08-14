package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver web = new ChromeDriver();
        web.manage().window().maximize();

        web.get("https://www.google.com");

        web.navigate().to("https://amazon.com");

        web.navigate().back();
        web.navigate().forward();
        web.navigate().refresh();
    }




}
