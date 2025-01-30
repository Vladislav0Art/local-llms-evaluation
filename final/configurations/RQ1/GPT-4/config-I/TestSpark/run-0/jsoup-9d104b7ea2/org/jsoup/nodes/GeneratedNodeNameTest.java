package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.*;

import static org.junit.Assert.*;

public class GeneratedNodeNameTest {


    // Test for normaliseWhitespace()

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("This is a text");
        assertEquals("#text", textNode.nodeName());
    }

}