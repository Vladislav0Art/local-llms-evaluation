package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.*;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {


    // Test for normaliseWhitespace()

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

}