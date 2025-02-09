package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Final space ");
        boolean hasWhitespace = TextNode.lastCharIsWhitespace(sb);
        Assert.assertTrue(hasWhitespace);
    }

}