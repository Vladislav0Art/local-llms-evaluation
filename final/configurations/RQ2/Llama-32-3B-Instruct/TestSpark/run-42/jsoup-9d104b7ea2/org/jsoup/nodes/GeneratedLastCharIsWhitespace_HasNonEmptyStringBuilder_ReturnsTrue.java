package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedLastCharIsWhitespace_HasNonEmptyStringBuilder_ReturnsTrue {

    @Test
    public void lastCharIsWhitespace_HasNonEmptyStringBuilder_ReturnsTrue() {
        StringBuilder nonEmptyStringBuilder = new StringBuilder("   ");
        boolean result = org.jsoup.helper.StringUtil.lastCharIsWhitespace(nonEmptyStringBuilder);
        assertTrue(result);
    }

}