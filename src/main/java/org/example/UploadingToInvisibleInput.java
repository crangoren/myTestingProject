package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingToInvisibleInput {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.Suleimanov\\IdeaProjects\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;


        try {
            driver.get("http://127.0.0.1:5500/index.html");
            Thread.sleep(5000);

            WebElement element = driver.findElement(By.id("a"));

            js.executeScript("document.querySelector('#a').setAttribute('style', 'opacity:1')");
            js.executeScript("document.querySelector('#a').setAttribute('style', 'width:1000px')");
            js.executeScript("document.querySelector('#a').setAttribute('style', 'height:1000px')");
            js.executeScript("document.querySelector('#a').setAttribute('style', 'display:block')");



        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
