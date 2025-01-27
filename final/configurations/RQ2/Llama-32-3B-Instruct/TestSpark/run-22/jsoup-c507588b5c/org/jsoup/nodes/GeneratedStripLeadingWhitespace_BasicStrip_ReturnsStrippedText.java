package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;

public class GeneratedStripLeadingWhitespace_BasicStrip_ReturnsStrippedText {

    @Test
    public void stripLeadingWhitespace_BasicStrip_ReturnsStrippedText() {
        String text = "   test   ";
        String expected = "test";
        assertEquals(expected, TextNode.stripLeadingWhitespace(text));
    }

}