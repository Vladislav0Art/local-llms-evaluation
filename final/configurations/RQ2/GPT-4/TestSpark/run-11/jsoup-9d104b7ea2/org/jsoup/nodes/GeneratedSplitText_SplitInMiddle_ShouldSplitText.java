package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedSplitText_SplitInMiddle_ShouldSplitText {

    @Test
    public void splitText_SplitInMiddle_ShouldSplitText() {
        TextNode textNode = new TextNode("SplitText");
        TextNode splitNode = textNode.splitText(4);
        Assert.assertEquals("Text", splitNode.getWholeText());
    }

}