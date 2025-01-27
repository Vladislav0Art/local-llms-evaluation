package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedStripLeadingWhitespaceStringStartsWithWhitespace {

    @Test
    public void stripLeadingWhitespaceStringStartsWithWhitespace() {
        String input = "   Hello World ";
        String expected = "Hello World";
        assertEquals(expected, StringUtil.stripLeadingWhitespace(input));
    }
}

}