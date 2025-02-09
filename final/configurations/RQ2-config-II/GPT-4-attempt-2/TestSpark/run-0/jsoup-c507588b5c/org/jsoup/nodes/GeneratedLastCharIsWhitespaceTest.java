package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean isWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("Whitespace "));
        Assert.assertTrue(isWhitespace);
        isWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("Whitespace"));
        Assert.assertFalse(isWhitespace);
    }

}