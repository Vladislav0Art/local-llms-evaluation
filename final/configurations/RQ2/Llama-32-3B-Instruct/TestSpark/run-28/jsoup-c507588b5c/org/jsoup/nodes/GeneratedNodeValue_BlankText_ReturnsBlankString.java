package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeValue_BlankText_ReturnsBlankString {

    @Test
    public void nodeValue_BlankText_ReturnsBlankString() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.nodeValue().isEmpty());
    }

}