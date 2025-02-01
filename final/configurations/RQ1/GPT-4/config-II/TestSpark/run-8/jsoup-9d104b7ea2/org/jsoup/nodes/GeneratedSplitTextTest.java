package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode tailNode = textNode.splitText(2);
        Assert.assertEquals("te", textNode.getWholeText());
        Assert.assertEquals("st", tailNode.getWholeText());
    }

}