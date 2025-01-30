package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.*;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {


    // Test for normaliseWhitespace()

    @Test
    public void normaliseWhitespaceTest() {
        String text = "    This is     a text     ";
        assertEquals("This is a text", TextNode.normaliseWhitespace(text));
    }

}