package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestTextConstructor {

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testTextConstructor() {
        TextNode node = createTextNode();
        assertNotNull(node.text());
        assertEquals("", node.text());
    }

}