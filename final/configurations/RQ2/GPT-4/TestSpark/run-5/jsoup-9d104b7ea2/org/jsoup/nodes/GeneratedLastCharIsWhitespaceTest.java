package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Parser;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("  test text ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));

        sb = new StringBuilder("test text");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}