package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedStripLeadingWhitespace_WithEmptyString_ReturnsEmptyString {

    @Test
    public void stripLeadingWhitespace_WithEmptyString_ReturnsEmptyString() {
        String emptyString = "";
        assertEquals("", StringUtil.stripLeadingWhitespace(emptyString));
    }

}