package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String str = "  Some text";
        String stripped = TextNode.stripLeadingWhitespace(str);
        assertEquals(stripped, "Some text");
    }

}