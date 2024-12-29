package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedStripLeadingWhitespace_WithSpaces {

    @Test
    public void stripLeadingWhitespace_WithSpaces() {
        String text = "   Hello World";
        String expected = "Hello World";

        assertEquals(expected, StringUtil.stripLeadingWhitespace(text));
    }

}