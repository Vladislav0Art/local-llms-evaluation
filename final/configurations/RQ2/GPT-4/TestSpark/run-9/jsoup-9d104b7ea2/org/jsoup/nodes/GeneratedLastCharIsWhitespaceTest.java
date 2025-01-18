package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean isLastCharWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("Sample Text "));
        Assert.assertTrue(isLastCharWhitespace);
    }

}