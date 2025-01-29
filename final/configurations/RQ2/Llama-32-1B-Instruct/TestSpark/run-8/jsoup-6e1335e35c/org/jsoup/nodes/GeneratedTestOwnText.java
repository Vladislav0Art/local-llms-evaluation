package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestOwnText {

    @Test
    public void testOwnText() {
        String text = "<p>Hello World!</p><span>This is a test</span>";
        Element element = parser.parseString(text);
        boolean ownText = element.getOwnText().isEmpty();
        assertTrue(ownText);
    }

}