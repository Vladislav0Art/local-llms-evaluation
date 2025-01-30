package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("SplitTest");
        TextNode tailNode = textNode.splitText(5);
        Assert.assertEquals("Split", textNode.getWholeText());
        Assert.assertEquals("Test", tailNode.getWholeText());
    }

}