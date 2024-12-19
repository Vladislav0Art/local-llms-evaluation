package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNormaliseWhitespace_GivenString_ReturnsEncodedString {

    @Test
    public void normaliseWhitespace_GivenString_ReturnsEncodedString() {
        String input = "Hello World!";
        String expected = StringUtil.normaliseWhitespace(input);
        assertEquals(expected, TextNodeUtil.normaliseWhitespace(input));
    }

}