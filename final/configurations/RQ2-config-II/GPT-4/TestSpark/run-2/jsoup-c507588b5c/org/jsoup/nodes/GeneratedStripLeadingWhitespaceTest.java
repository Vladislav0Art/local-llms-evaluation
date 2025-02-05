package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String leadingWhitespaceText = "   test";
        String strippedText = "test";
        Assert.assertEquals(strippedText, TextNode.stripLeadingWhitespace(leadingWhitespaceText));
    }

}