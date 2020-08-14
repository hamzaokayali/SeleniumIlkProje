package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver web = new ChromeDriver();
        web.manage().window().maximize();
        web.get("http://amozon.com");
        String sTitle = web.getTitle();
        if (sTitle.toLowerCase().contains("online"))
            System.out.println("var");
        else
            System.out.println("yok");
        web.quit();

    }
}
