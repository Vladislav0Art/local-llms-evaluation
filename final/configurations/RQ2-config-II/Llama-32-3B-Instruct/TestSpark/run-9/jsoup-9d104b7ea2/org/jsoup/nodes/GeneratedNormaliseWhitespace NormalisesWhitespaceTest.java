package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedNormaliseWhitespace NormalisesWhitespaceTest {

    @Test
    public void normaliseWhitespace

    NormalisesWhitespaceTest() {
        String input = "   ";
        String expectedOutput = StringUtil.normaliseWhitespace(input);
        assertEquals(expectedOutput, TextNode.normaliseWhitespace(input));
    }

}