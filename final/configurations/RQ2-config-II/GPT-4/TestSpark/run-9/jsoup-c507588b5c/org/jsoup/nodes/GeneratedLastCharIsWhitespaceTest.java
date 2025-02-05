package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("charIsWhitespace ");
        Assert.assertEquals(true, TextNode.lastCharIsWhitespace(sb));
        sb = new StringBuilder("charIsWhitespace x");
        Assert.assertEquals(false, TextNode.lastCharIsWhitespace(sb));
    }

}