package org.jsoup.nodes;

import org.jsoup.helper.StringUtil;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = " sam   ple ";
        String normalised = TextNode.normaliseWhitespace(text);
        assertEquals("sam ple", normalised);
    }

}