package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;

public class ConsoleLogsCapture {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//malatesh.adakayavar//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.linkText("Browse Products")).click();
        driver.findElement(By.partialLinkText("Selenium")).click();
        driver.findElement(By.cssSelector(".add-to-cart")).click();
        driver.findElement(By.linkText("Cart")).click();
        driver.findElement(By.id("exampleInputEmail1")).clear();
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");

        LogEntries entries = driver.manage().logs().get(LogType.BROWSER);  //Get LogEntries object
        List<LogEntry> logs = entries.getAll(); // GetEntryObject -- getAll() returns all logs in list

        for(LogEntry e :logs ){    // Iterating through list & printing each log message
            System.out.println(e.getMessage());
        }

    }
}
