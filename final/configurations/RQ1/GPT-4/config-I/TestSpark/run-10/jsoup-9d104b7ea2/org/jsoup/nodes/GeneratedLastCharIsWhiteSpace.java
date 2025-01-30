package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhiteSpace {

    @Test
    public void lastCharIsWhiteSpace() {
        StringBuilder sb = new StringBuilder("Test Node ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}