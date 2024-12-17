package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest_singleSpace {

    @Test
    public void stripLeadingWhitespaceTest_singleSpace() {
        String text = " ";
        String expectedText = " ";
        assertEquals(expectedText, TextNode.stripLeadingWhitespace(text));
    }

}