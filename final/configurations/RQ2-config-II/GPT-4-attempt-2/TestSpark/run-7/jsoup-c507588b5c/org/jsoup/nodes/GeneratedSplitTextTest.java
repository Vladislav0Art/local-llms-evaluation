package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("Original");
        TextNode split = tn.splitText(4);
        Assert.assertEquals("Orig", tn.getWholeText());
        Assert.assertEquals("inal", split.getWholeText());
    }

}