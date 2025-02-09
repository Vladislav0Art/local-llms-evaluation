package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedNormaliseWhitespace_HasWhitespace_ReturnsStringWithoutLeadingWhitespace {

    @Test
    public void normaliseWhitespace_HasWhitespace_ReturnsStringWithoutLeadingWhitespace() {
        String input = "   Hello, World!";
        String expected = "Hello, World!";
        String result = org.jsoup.helper.StringUtil.normaliseWhitespace(input);
        assertTrue(result.startsWith(expected));
    }

}