package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String input = "    Hello    World  ";
        String normalized = TextNode.normaliseWhitespace(input);
        assertEquals("Hello World", normalized);
    }

}