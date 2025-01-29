package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestLastCharIsWhitespace {

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testLastCharIsWhitespace() {
        TextNode node = createTextNode("Hello, World!");
        assertTrue(node.lastCharIsWhitespace());
    }

}