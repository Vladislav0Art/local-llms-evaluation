package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncoded_ReturnsValidText {

    @Test
    public void createFromEncoded_ReturnsValidText() {
        String encodedText = "Hello, World!";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("Hello, World!", node.text());
    }

}