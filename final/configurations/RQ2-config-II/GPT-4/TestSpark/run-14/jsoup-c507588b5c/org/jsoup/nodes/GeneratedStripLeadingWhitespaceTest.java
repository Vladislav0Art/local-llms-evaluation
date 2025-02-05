package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String input = "    Hello World";
        String stripped = TextNode.stripLeadingWhitespace(input);
        assertEquals("Hello World", stripped);
    }

}