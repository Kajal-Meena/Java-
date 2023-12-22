package com.metlife.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new ChromeDriver();
        driver.get("https://www.google.com");
        driver1.get("https://www.facebook.com");
        String a = driver.getTitle();
        System.out.println(a);
        driver1.quit();
    }
}
