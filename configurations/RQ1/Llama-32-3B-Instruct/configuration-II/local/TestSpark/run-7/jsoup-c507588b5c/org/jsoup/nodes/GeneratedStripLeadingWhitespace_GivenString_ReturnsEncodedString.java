package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedStripLeadingWhitespace_GivenString_ReturnsEncodedString {

    @Test
    public void stripLeadingWhitespace_GivenString_ReturnsEncodedString() {
        String input = "   Hello World!";
        String expected = TextNodeUtil.stripLeadingWhitespace(input);
        assertEquals(expected, StringUtil.stripLeadingWhitespace(input));
    }

}