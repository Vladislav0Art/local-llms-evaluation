package org.jsoup.nodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GeneratedTestNestedClasses {

    @Test
    public void testNestedClasses() throws Exception {
        WebDriver driver = new org.openqa.selenium.ChromeDriver();
        driver.get("http://www.test.com");

        String[] methods = {"myClass", "myMethod"};
        for (String method : methods) {
            if (!driver.getClass().getMethod(method).toString().contains(".myClass.myMethod")) {
                throw new RuntimeException("Expected " + method + ".myClass.myMethod to be a public method");
            }
        }

        driver.findElement(By.tagName("input")).sendKeys("Hello World!".getBytes());
    }

}