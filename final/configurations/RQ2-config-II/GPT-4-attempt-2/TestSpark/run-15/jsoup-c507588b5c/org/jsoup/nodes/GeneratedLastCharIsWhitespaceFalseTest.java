package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceFalseTest {

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder stringBuilder = new StringBuilder("No whitespace at end.");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(stringBuilder));
    }

}