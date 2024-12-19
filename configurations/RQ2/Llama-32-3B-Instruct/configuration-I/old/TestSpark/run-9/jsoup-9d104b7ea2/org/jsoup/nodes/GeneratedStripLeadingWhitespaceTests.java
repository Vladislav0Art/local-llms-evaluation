package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceTests {

    @Test
    public void stripLeadingWhitespaceTests() {
        String text = "   Hello World";
        assertEquals("  Hello World", TextNode.stripLeadingWhitespace(text));
    }

}