package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextOffsetTextNode_Test {

    @Test
    public void splitTextOffsetTextNode_Test() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        TextNode result1 = textNode.splitText(6);
        assertEquals("World", result1.text());
        assertNotNull(result1.nodeName());
    }

}