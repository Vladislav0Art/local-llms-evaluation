package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedStripLeadingWhitespace_GivenText_ReturnsStripedText {

    @Test
    public void stripLeadingWhitespace_GivenText_ReturnsStripedText() {
        String text = "   Hello World  ";
        String strippedText = TextNode.stripLeadingWhitespace(text);
        assertEquals("Hello World", strippedText);
    }

}