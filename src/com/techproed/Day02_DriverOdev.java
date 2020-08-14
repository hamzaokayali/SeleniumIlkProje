package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// driver'ımızı ekranı kaplayacak şekilde kullanalım.
// 1 - ilk önce google.com'a gidelim.
// 2 - sayfanın title'ını alalım ve ekrana yazdıralım.
// 3 - daha sonra youtube.com'a gidelim.
// 4 - sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
// 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
// 6 - driver'ımızı kapatalım.
public class Day02_DriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver web = new ChromeDriver();
        web.manage().window().maximize();
        web.get("https://www.google.com");
        String sayfaTitle = web.getTitle();
        System.out.println(sayfaTitle);
        web.navigate().to("https://youtube.com");
        sayfaTitle = web.getTitle();
        System.out.println(sayfaTitle);
        web.navigate().back();
        String sayfaUrl = web.getCurrentUrl();
        System.out.println(sayfaUrl);
        web.quit();

    }
}
