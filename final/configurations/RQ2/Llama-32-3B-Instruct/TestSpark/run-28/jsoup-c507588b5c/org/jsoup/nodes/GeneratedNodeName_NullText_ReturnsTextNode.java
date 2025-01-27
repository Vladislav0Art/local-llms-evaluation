package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeName_NullText_ReturnsTextNode {

    @Test
    public void nodeName_NullText_ReturnsTextNode() {
        TextNode textNode = new TextNode(null);
        assertEquals(TextNode.class, textNode.nodeName());
    }

}