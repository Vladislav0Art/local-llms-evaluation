package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean isLastWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("Test "));
        Assert.assertTrue(isLastWhitespace);
    }

}