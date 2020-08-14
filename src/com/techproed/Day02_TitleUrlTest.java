package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver web = new ChromeDriver();

        web.navigate().to("http://youtube.com");
        String youtubeTitle = web.getTitle();
        if (youtubeTitle.toLowerCase().contains("video"))
            System.out.println("var");
        else
            System.out.println("yok");
        web.quit();
    }

}
