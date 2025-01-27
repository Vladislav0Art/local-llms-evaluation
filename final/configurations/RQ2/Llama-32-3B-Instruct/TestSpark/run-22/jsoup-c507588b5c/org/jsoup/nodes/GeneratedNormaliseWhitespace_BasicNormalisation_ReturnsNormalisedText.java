package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;

public class GeneratedNormaliseWhitespace_BasicNormalisation_ReturnsNormalisedText {

    @Test
    public void normaliseWhitespace_BasicNormalisation_ReturnsNormalisedText() {
        String text = "   test   ";
        String expected = "test";
        assertEquals(expected, TextNode.normaliseWhitespace(text));
    }

}