package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("test "));
        Assert.assertTrue(result);
    }

}