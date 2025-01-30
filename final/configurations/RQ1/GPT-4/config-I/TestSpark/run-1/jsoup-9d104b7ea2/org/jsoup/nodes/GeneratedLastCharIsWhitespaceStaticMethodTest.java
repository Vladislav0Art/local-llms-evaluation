package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceStaticMethodTest {

    @Test
    public void lastCharIsWhitespaceStaticMethodTest() {
        StringBuilder builder = new StringBuilder("Last char is whitespace ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(builder));
        builder = new StringBuilder("No trailing whitespace");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(builder));
    }

}