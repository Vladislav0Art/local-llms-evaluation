package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestSplitText {

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testSplitText() {
        TextNode node = createTextNode("Hello, World!");
        String wholeText = node.getWholeText();
        String[] parts = wholeText.split("");
        assertNotNull(parts);
        assertEquals(2, parts.length);
        assertTrue(parts[0].trim().isEmpty());
        assertTrue(parts[1].trim().isEmpty());
    }

}