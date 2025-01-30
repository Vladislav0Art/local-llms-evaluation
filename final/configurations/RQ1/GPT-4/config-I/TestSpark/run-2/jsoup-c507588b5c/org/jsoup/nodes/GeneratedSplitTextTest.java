package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("SplitText");
        TextNode splitNode = tn.splitText(4);
        Assert.assertEquals("Split", tn.getWholeText());
        Assert.assertEquals("Text", splitNode.getWholeText());
    }

}