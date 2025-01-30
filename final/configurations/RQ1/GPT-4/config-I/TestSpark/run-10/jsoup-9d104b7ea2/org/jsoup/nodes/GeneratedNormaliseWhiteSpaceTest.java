package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhiteSpaceTest {

    @Test
    public void normaliseWhiteSpaceTest() {
        String text = " Test\nNode  ";
        Assert.assertEquals("Test Node", TextNode.normaliseWhitespace(text));
    }

}