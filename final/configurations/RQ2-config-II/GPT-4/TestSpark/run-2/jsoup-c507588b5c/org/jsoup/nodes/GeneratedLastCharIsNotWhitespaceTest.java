package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsNotWhitespaceTest {

    @Test
    public void lastCharIsNotWhitespaceTest() {
        StringBuilder sb = new StringBuilder("test");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}