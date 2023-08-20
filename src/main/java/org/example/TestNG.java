package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNG {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.Suleimanov\\IdeaProjects\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://127.0.0.1:5500/index.html");
            Thread.sleep(5000);

            String title = driver.getTitle();

            Assert.assertEquals(title, "Document");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
