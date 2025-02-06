package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedStripLeadingWhitespace StripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespace

    StripLeadingWhitespaceTest() {
        String input = "   Hello World";
        String expectedOutput = TextNode.stripLeadingWhitespace(input);
        assertEquals(expectedOutput, TextNode.stripLeadingWhitespace(input));
    }

}