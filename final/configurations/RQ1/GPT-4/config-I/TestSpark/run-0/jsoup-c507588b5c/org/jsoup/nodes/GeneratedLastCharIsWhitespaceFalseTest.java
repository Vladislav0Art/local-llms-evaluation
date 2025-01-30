package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.TextNode;

public class GeneratedLastCharIsWhitespaceFalseTest {

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Test"));
        Assert.assertFalse(result);
    }

}