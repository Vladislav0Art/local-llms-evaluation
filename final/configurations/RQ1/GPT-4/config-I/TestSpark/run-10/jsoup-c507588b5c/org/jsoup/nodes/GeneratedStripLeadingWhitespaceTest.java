package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "   Leading whitespace";
        String result = TextNode.stripLeadingWhitespace(text);

        Assert.assertEquals("Leading whitespace", result);
    }

}