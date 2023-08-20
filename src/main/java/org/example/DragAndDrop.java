package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.Suleimanov\\IdeaProjects\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://crossbrowsertesting.github.io/drag-and-drop");

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000);
            WebElement element1 = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);
            actions.moveToElement(element1)
                    .clickAndHold()
                    .moveToElement(element2)
                    .release()
                    .build()
                    .perform();
//            actions.dragAndDrop(element2, element1);


        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {
            Thread.sleep(3000);
            driver.quit();
        }



    }
}
