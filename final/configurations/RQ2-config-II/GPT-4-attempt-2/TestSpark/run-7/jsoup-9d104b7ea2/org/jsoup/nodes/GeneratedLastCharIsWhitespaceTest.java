package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("lastCharIsWhitespace "));
        Assert.assertTrue(result);
        result = TextNode.lastCharIsWhitespace(new StringBuilder("lastCharIsWhitespace"));
        Assert.assertFalse(result);
    }

}