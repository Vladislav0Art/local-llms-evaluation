package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = TextNode.normaliseWhitespace("test  testing");
        Assert.assertEquals("test testing", text);
    }

}