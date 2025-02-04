package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateTextNode_ValidText_ReturnsTextNode {

    @Test
    public void createTextNode_ValidText_ReturnsTextNode() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.value());
    }

}