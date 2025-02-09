package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("    normalise   whitespace test");
        Assert.assertEquals(" normalise whitespace test", result);
    }

}