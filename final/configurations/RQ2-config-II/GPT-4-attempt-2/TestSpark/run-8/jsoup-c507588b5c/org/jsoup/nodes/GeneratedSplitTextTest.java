package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("testing");
        TextNode splitNode = textNode.splitText(4);
        Assert.assertEquals("test", textNode.getWholeText());
        assertEquals("ing", splitNode.getWholeText());
    }

}