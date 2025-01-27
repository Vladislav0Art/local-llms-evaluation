package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedNormaliseWhitespaceSingleCharNotWhitespace {

    @Test
    public void normaliseWhitespaceSingleCharNotWhitespace() {
        String input = "A";
        String expected = "A";
        assertEquals(expected, StringUtil.normaliseWhitespace(input));
    }

}