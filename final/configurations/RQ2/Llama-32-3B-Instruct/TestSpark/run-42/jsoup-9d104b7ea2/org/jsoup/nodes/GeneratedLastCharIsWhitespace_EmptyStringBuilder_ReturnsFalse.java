package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedLastCharIsWhitespace_EmptyStringBuilder_ReturnsFalse {

    @Test
    public void lastCharIsWhitespace_EmptyStringBuilder_ReturnsFalse() {
        StringBuilder emptyStringBuilder = new StringBuilder();
        boolean result = org.jsoup.helper.StringUtil.lastCharIsWhitespace(emptyStringBuilder);
        assertFalse(result);
    }

}