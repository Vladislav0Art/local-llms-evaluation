package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewTextNode_GivenText_ReturnsCreatedTextNode {

    @Test
    public void newTextNode_GivenText_ReturnsCreatedTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        assertNotNull(textNode);
        assertEquals("textNode", textNode.nodeName());
        assertEquals("Hello, World!", textNode.text());
    }

}