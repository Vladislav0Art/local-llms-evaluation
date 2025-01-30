package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.*;

import static org.junit.Assert.*;

public class GeneratedSplitTextNegativeTest {


    // Test for normaliseWhitespace()

    @Test
    public void splitTextNegativeTest() {
        TextNode textNode = new TextNode("This is a text");
        textNode.splitText(-1);
    }

}