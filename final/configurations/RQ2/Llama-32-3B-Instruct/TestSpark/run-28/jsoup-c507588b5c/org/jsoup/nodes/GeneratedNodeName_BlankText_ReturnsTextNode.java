package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeName_BlankText_ReturnsTextNode {

    @Test
    public void nodeName_BlankText_ReturnsTextNode() {
        TextNode textNode = new TextNode("");
        assertEquals(TextNode.class, textNode.nodeName());
    }

}