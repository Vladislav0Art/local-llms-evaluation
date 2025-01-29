package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestGetWholeText {

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testGetWholeText() {
        TextNode node = createTextNode("Hello, World!");
        String wholeText = node.getWholeText();
        assertNotNull(wholeText);
        assertEquals("Hello, World!", wholeText);
    }

}