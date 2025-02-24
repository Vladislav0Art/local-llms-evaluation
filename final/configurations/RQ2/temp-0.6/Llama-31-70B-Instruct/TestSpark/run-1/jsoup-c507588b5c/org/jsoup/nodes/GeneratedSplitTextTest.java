package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Some text");
        TextNode splitTextNode = textNode.splitText(2);

        Assert.assertEquals("me text", splitTextNode.text());
    }

}