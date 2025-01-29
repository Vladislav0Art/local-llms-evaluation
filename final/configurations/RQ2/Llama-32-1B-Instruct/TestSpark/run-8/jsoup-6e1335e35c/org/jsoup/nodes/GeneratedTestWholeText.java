package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestWholeText {

    @Test
    public void testWholeText() {
        String text = "<p>Hello World!</p><span>This is a test</span>";
        Element element = parser.parseString(text);
        String wholeText = element.getWholeText();
        assertTrue(wholeText.contains("<p>Hello World!</p>"));
    }

}