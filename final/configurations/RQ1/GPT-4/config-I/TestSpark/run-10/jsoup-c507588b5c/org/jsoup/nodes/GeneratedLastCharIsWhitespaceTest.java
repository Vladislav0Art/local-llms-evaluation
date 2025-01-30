package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("With whitespace ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));

        sb.deleteCharAt(sb.length() - 1);
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}