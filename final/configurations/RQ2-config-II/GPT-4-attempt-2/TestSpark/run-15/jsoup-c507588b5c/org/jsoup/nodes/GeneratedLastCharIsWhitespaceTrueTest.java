package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTrueTest {

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder stringBuilder = new StringBuilder("Whitespace at end ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(stringBuilder));
    }

}