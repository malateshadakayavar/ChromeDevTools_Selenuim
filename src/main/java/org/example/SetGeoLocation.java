package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.util.HashMap;
import java.util.Map;

public class SetGeoLocation {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://Users//malatesh.adakayavar//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        Map<String, Object> coordinates = new HashMap<String, Object>();
        coordinates.put("latitude", 40);
        coordinates.put("longitude", 3);
        coordinates.put("accuracy", 1);
        driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Netflix", Keys.ENTER);
        driver.findElements(By.cssSelector(".LC20lb")).getFirst().click();
        String title = driver.findElement(By.cssSelector(".out-story-card-title")).getText();
        System.out.println(title);

    }
}
