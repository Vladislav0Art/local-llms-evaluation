package org.jsoup.nodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GeneratedTestAddElement {

    @Test
    public void testAddElement() throws Exception {
        WebDriver driver = new org.openqa.selenium.ChromeDriver();
        driver.get("http://www.test.com");

        String[] methods = {"myList", "addElement"};
        for (String method : methods) {
            if (!driver.getClass().getMethod(method).toString().contains(".myList.append")) {
                throw new RuntimeException("Expected myList.append to be a public method");
            }
        }

        driver.findElement(By.tagName("button")).click();
    }

}