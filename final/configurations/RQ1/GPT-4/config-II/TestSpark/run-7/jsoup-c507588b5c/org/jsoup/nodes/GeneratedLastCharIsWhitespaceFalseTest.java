package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceFalseTest {

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder sb = new StringBuilder("Test");
        boolean result = TextNode.lastCharIsWhitespace(sb);
        Assert.assertEquals(false, result);
    }

}