package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeName_DefaultText_ReturnsTextNode {

    @Test
    public void nodeName_DefaultText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Default text");
        assertEquals(TextNode.class, textNode.nodeName());
    }

}