package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedStripLeadingWhitespaceTest {

    // Tests for TextNode(String text)

    @Test
    public void stripLeadingWhitespaceTest() {
        String result = TextNode.stripLeadingWhitespace("     Hello, World!");
        Assert.assertEquals("Hello, World!", result);
    }

}