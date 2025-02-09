package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String stripped = TextNode.stripLeadingWhitespace("   Stripped");

        assertEquals("Stripped", stripped);
    }

}