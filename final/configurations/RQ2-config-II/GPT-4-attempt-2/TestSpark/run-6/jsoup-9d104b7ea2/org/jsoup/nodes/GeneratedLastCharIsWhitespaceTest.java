package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("sample text ");
        boolean result = TextNode.lastCharIsWhitespace(sb);
        Assert.assertTrue(result);
    }

}