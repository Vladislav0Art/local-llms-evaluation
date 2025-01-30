package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("SplitMe");
        TextNode newText = textNode.splitText(5);

        Assert.assertEquals("Split", textNode.getWholeText());
        Assert.assertEquals("Me", newText.getWholeText());
    }

}