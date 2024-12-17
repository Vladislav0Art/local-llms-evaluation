package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest_emptyString {

    @Test
    public void stripLeadingWhitespaceTest_emptyString() {
        String text = "";
        String expectedText = "";
        assertEquals(expectedText, TextNode.stripLeadingWhitespace(text));
    }

}