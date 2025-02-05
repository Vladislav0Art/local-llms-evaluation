package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean lastIsWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("sample text "));
        Assert.assertTrue(lastIsWhitespace);
    }

}