package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedToStringTextNode_Test {

    @Test
    public void toStringTextNode_Test() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode.toString());
    }

}