package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestIsBlank {

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testIsBlank() {
        TextNode node = createTextNode("Hello");
        assertTrue(node.isBlank());
        assertFalse(node.isBlank());
    }

}