package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String normalized = TextNode.normaliseWhitespace(" a   \n   b ");
        Assert.assertEquals(" a b ", normalized);
    }

}