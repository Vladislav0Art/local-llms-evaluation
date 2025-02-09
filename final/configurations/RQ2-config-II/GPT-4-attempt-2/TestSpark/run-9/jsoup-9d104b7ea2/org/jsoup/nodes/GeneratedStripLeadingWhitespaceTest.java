package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String result = TextNode.stripLeadingWhitespace("    strip this");
        assertNotNull(result);
        assertEquals("strip this", result);
    }

}