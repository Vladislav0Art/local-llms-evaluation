package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("test ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}