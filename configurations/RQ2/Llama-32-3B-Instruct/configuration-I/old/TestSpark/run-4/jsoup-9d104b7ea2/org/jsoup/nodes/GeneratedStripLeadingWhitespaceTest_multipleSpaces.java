package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest_multipleSpaces {

    @Test
    public void stripLeadingWhitespaceTest_multipleSpaces() {
        String text = "   ";
        String expectedText = " ";
        assertEquals(expectedText, TextNode.stripLeadingWhitespace(text));
    }

}