package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedNormaliseWhitespace_EmptyString_ReturnsEmptyString {

    @Test
    public void normaliseWhitespace_EmptyString_ReturnsEmptyString() {
        String input = "";
        String expected = "";
        String result = org.jsoup.helper.StringUtil.normaliseWhitespace(input);
        assertEquals(expected, result);
    }

}