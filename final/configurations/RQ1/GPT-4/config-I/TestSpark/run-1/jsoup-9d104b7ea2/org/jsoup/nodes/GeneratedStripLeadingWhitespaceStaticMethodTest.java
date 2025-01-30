package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedStripLeadingWhitespaceStaticMethodTest {

    @Test
    public void stripLeadingWhitespaceStaticMethodTest() {
        String strippedText = TextNode.stripLeadingWhitespace("    Strip leading whitespace");
        Assert.assertEquals("Strip leading whitespace", strippedText);
    }

}