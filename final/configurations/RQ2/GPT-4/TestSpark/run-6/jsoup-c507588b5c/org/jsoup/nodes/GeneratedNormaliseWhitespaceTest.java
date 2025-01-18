package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String normalised = TextNode.normaliseWhitespace(" T e   st te  xt ");
        Assert.assertEquals("T e st te xt", normalised);
    }

}