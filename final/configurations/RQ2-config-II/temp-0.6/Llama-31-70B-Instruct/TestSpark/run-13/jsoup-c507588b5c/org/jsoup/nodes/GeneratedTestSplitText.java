package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("text");
        TextNode splitTextNode = textNode.splitText(2);
        Assert.assertEquals("te", textNode.coreValue());
        Assert.assertEquals("xt", splitTextNode.coreValue());
    }

}