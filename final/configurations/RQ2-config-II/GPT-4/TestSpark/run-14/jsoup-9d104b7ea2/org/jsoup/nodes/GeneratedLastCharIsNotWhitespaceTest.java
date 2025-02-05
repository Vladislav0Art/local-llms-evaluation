package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutlineTag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsNotWhitespaceTest {

    @Test
    public void lastCharIsNotWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Test Case");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}