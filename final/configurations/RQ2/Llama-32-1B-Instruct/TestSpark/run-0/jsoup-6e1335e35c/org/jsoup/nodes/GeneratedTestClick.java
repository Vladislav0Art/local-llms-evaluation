package org.jsoup.nodes;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GeneratedTestClick {

    @Test
    public void testClick() {
        TestBrowser browser = new TestBrowser();
        browser.openPage("https://www.google.com");
        browser.navigateToTab("https://www.bing.com");

        // Call the method on the page object
        browser.getPage().clickElement(By.byId, "search_box");
    }

}