package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.Suleimanov\\IdeaProjects\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://udemy.com");



       Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                WebElement form = driver.findElement(By.xpath("//input[@name='q']"));
                form.sendKeys("Java");

            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
                searchButton.click();

            }
        });

        thread2.start();
        thread2.join();
        thread3.start();
    }
}