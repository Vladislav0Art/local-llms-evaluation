package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeValue_NonBlankText_ReturnsTextNode {

    @Test
    public void nodeValue_NonBlankText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Not default text");
        assertEquals("Not default text", textNode.nodeValue());
    }

}