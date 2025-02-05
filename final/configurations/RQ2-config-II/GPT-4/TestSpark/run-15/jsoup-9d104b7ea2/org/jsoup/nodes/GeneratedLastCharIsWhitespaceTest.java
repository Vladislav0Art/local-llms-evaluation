package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder stringBuilder = new StringBuilder("Some text ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(stringBuilder));

        stringBuilder = new StringBuilder("Some text");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(stringBuilder));
    }

}