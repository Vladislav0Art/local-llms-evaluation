package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "     Leading Whitespace Removed ";
        assertEquals("Leading Whitespace Removed ", TextNode.stripLeadingWhitespace(text));
    }

}