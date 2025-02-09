package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedLastCharIsWhitespace_WithNonEmptyStringBuilder_ReturnsTrue {

    @Test
    public void lastCharIsWhitespace_WithNonEmptyStringBuilder_ReturnsTrue() {
        StringBuilder nonEmptyStringBuilder = new StringBuilder("   ");
        boolean result = StringUtil.lastCharIsWhitespace(nonEmptyStringBuilder);
        assertTrue(result);
    }

}