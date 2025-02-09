package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    // Tests for TextNode(String text)

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("Hello,     World!");
        Assert.assertEquals("Hello, World!", result);
    }

}