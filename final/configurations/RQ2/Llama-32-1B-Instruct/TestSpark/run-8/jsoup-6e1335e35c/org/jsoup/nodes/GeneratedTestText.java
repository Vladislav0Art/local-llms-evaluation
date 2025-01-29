package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestText {

    @Test
    public void testText() {
        String text = "<p>Hello World!</p>";
        Element element = parser.parseString(text);
        assertTrue(element.getTextContent().isEmpty());
        element.setTextContent("Hello World!");
        assertTrue(element.getTextContent().equals("Hello World!"));
    }

}