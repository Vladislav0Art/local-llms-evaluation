package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.*;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {


    // Test for normaliseWhitespace()

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("This is a text");
        TextNode splittedTextNode = textNode.splitText(4);
        assertEquals("This", textNode.text());
        assertEquals(" is a text", splittedTextNode.text());
    }

}