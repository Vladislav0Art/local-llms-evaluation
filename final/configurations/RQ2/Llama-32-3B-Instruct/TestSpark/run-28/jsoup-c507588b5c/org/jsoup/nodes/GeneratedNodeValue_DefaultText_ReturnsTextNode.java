package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeValue_DefaultText_ReturnsTextNode {

    @Test
    public void nodeValue_DefaultText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Default text");
        assertEquals("Default text", textNode.nodeValue());
    }

}