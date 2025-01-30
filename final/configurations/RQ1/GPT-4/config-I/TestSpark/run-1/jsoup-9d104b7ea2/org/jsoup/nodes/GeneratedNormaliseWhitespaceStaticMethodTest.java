package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceStaticMethodTest {

    @Test
    public void normaliseWhitespaceStaticMethodTest() {
        String normalizedText = TextNode.normaliseWhitespace(" Normalize    Whitespace ");
        Assert.assertEquals("Normalize Whitespace", normalizedText);
    }

}