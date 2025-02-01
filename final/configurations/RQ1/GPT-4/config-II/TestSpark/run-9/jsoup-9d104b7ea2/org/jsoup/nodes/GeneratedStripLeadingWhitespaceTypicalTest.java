package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTypicalTest {

    @Test
    public void stripLeadingWhitespaceTypicalTest() {
        String output = TextNode.stripLeadingWhitespace(" Hello World");

        assertEquals("Hello World", output);
    }

}