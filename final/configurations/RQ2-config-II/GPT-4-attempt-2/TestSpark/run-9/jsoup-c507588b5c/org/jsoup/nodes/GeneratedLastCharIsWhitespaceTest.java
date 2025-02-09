package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Sample Text ");
        boolean result = TextNode.lastCharIsWhitespace(sb);

        Assert.assertTrue(result);
    }

}