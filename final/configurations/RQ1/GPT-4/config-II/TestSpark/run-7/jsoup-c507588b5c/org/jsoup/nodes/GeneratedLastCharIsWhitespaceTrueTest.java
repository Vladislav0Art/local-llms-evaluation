package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTrueTest {

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder sb = new StringBuilder("Test ");
        boolean result = TextNode.lastCharIsWhitespace(sb);
        Assert.assertEquals(true, result);
    }

}