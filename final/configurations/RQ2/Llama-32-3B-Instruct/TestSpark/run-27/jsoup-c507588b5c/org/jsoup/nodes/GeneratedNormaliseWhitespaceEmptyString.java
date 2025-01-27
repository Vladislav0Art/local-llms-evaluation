package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedNormaliseWhitespaceEmptyString {

    @Test
    public void normaliseWhitespaceEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, StringUtil.normaliseWhitespace(input));
    }

}