package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Has trailing space ");
        boolean result = TextNode.lastCharIsWhitespace(sb);
        Assert.assertTrue(result);
    }

}