package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WikipediaLogin {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//*[@id=\"pt-login-2\"]/a/span")).click();
        driver.findElement(By.id("wpName1")).sendKeys("Automation1234");
        driver.findElement(By.id("wpPassword1")).sendKeys("Automation@1234");
        driver.findElement(By.id("wpLoginAttempt")).click();
    }
}
