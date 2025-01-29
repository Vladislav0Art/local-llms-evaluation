package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestWholeOwnText {

    @Test
    public void testWholeOwnText() {
        String text = "<p>Hello World!</p><span>This is a test</span>";
        Element element = parser.parseString(text);
        String wholeOwnText = element.getWholeOwnText();
        assertTrue(wholeOwnText.contains("<p>Hello World!</p>"));
    }

}