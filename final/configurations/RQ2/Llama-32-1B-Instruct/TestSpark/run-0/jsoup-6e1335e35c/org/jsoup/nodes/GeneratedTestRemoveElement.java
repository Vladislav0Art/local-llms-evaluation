package org.jsoup.nodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GeneratedTestRemoveElement {

    @Test
    public void testRemoveElement() throws Exception {
        WebDriver driver = new org.openqa.selenium.ChromeDriver();
        driver.get("http://www.test.com");

        String[] methods = {"myList", "removeElement"};
        for (String method : methods) {
            if (!driver.getClass().getMethod(method).toString().contains(".myList.remove")) {
                throw new RuntimeException("Expected myList.remove to be a public method");
            }
        }

        driver.findElement(By.tagName("button")).click();
    }

}