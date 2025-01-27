package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeName_NonBlankText_ReturnsTextNode {

    @Test
    public void nodeName_NonBlankText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Not default text");
        assertEquals(TextNode.class, textNode.nodeName());
    }

}