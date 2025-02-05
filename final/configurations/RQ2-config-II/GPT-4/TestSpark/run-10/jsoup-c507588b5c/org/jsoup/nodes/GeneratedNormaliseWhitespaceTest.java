package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "   Hello,  World!  ";
        assertEquals("Hello, World!", TextNode.normaliseWhitespace(text));
    }

}