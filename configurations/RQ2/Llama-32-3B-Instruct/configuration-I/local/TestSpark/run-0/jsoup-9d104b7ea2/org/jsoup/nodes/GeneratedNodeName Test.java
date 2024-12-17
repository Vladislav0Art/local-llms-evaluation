package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedNodeName Test {

    @Test
    public void nodeName

    Test() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertEquals("text", textNode.nodeName());
    }

}