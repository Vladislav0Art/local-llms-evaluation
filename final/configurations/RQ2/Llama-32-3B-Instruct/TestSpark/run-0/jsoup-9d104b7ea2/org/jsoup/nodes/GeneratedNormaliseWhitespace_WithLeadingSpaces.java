package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedNormaliseWhitespace_WithLeadingSpaces {

    @Test
    public void normaliseWhitespace_WithLeadingSpaces() {
        String text = "   Hello World";
        String expected = "Hello World";

        assertEquals(expected, StringUtil.normaliseWhitespace(text));
    }

}