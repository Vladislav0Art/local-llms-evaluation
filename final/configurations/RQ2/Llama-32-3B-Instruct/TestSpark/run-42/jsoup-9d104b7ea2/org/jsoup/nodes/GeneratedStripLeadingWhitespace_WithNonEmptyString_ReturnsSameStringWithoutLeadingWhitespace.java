package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedStripLeadingWhitespace_WithNonEmptyString_ReturnsSameStringWithoutLeadingWhitespace {

    @Test
    public void stripLeadingWhitespace_WithNonEmptyString_ReturnsSameStringWithoutLeadingWhitespace() {
        String nonEmptyString = "   Hello, World!";
        String result = StringUtil.stripLeadingWhitespace(nonEmptyString);
        assertTrue(result.startsWith("Hello, World!"));
    }

}