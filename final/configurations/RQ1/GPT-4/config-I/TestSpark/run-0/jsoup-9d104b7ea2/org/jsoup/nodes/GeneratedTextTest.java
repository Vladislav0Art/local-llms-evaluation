package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.*;

import static org.junit.Assert.*;

public class GeneratedTextTest {


    // Test for normaliseWhitespace()

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("This is     a text");
        assertEquals("This is a text", textNode.text());
    }

}