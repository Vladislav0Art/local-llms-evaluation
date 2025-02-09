package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedNormaliseWhitespace_NoWhitespace_ReturnsOriginalString {

    @Test
    public void normaliseWhitespace_NoWhitespace_ReturnsOriginalString() {
        String input = "Hello, World!";
        String expected = "Hello, World!";
        String result = org.jsoup.helper.StringUtil.normaliseWhitespace(input);
        assertEquals(expected, result);
    }

}