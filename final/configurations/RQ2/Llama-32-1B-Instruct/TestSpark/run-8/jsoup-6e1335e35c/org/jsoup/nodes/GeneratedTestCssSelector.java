package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCssSelector {

    @Test
    public void testCssSelector() {
        String cssSelector = "p";
        Element element = parser.parseString("<p>Hello World!</p>");
        assertTrue(element.getCssSelector().contains(cssSelector));
    }

}