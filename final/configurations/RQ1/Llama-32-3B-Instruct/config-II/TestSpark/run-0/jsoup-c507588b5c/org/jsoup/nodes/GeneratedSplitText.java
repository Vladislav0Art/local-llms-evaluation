package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText {

    @Test
    public void splitText() throws IOException {
        TextNode node = new TextNode("Hello World");
        TextNode tail = node.splitText(6);
        assertEquals("Hello", tail.text());
        assertNotNull(tail.parentNode());
        assertNotNull(tail);
    }

}