package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTest {

    // Tests for TextNode(String text)

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, World! ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));

        sb = new StringBuilder();
        sb.append("Hello, World!");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}