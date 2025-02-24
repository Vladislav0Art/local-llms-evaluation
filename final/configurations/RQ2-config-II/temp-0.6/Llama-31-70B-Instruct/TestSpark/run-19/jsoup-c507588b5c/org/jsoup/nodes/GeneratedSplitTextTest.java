package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("hello");
        TextNode splitTextNode = textNode.splitText(2);
        Assert.assertEquals("llo", splitTextNode.text());
    }

}