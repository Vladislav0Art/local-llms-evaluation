package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestToString {

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testToString() {
        TextNode node = createTextNode("Hello, World!");
        String html = node.toString();
        assertNotNull(html);
    }

}