package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "   sample text";
        String result = TextNode.stripLeadingWhitespace(text);
        Assert.assertEquals("sample text", result);
    }

}