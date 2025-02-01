package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String unstripped = "  Test String";
        String stripped = TextNode.stripLeadingWhitespace(unstripped);
        assertEquals("Test String", stripped);
    }

}